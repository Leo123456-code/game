package com.fxkj.ssc.utils.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 本地緩存--简单的内存缓存工具类
 * 本工具类主要采用HashMap+定时器线程池实现，map用于存储键值对数据，map的value是Cache的内部类对象Entity，Entity包含value和该键值对的生命周期定时器Future。
 * Cache类对外只提供了put(key, value), put(key, value, expire), get(key), get(key, class), remove(key), size()几个同步方法。
 * 当添加键值对数据的时候，首先会调用remove()方法，清除掉原来相同key的数据，并取消对应的定时清除任务，然后添加新数据到map中，
 * 并且，如果设置了有效时间，则添加对应的定时清除任务到定时器线程池。
 */
public class LocalCache {
    //键值对集合
    private final static Map<String, Entity> map = new HashMap<>();
    //定时器线程池，用于清除过期缓存
    private final static ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    /**
     * 添加缓存
     *
     * @param key  键
     * @param data 值
     */
    public synchronized static void put(String key, Object data) {
        LocalCache.put(key, data, 0);
    }

    /**
     * 添加缓存
     *
     * @param key    键
     * @param data   值
     * @param expire 过期时间，单位：毫秒， 0表示无限长
     */
    @SuppressWarnings("rawtypes")
	public synchronized static void put(String key, Object data, long expire) {
        //清除原键值对
        LocalCache.remove(key);
        //设置过期时间
        if (expire > 0) {
            Future future = executor.schedule(new Runnable() {
                @Override
                public void run() {
                    //过期后清除该键值对
                    synchronized (LocalCache.class) {
                        map.remove(key);
                    }
                }
            }, expire, TimeUnit.MILLISECONDS);
            map.put(key, new Entity(data, future));
        } else {
            //不设置过期时间
            map.put(key, new Entity(data, null));
        }
    }

    /**
     * 读取缓存
     *
     * @param key 键
     * @return
     */
    public synchronized static Object get(String key) {
        Entity entity = map.get(key);
        return entity == null ? null : entity.getValue();
    }

    /**
     * 读取缓存
     *
     * @param key 键
     *            * @param clazz 值类型
     * @return
     */
    public synchronized static <T> T get(String key, Class<T> clazz) {
        return clazz.cast(LocalCache.get(key));
    }

    /**
     * 清除缓存
     *
     * @param key
     * @return
     */
    @SuppressWarnings("rawtypes")
	public synchronized static Object remove(String key) {
        //清除原缓存数据
        Entity entity = map.remove(key);
        if (entity == null) return null;
        //清除原键值对定时器
        Future future = entity.getFuture();
        if (future != null) future.cancel(true);
        return entity.getValue();
    }

    /**
     * 查询当前缓存的键值对数量
     *
     * @return
     */
    public synchronized static int size() {
        return map.size();
    }

    /**
     * 缓存实体类
     */
    private static class Entity {
        //键值对的value
        private Object value;
        //定时器Future
        @SuppressWarnings("rawtypes")
		private Future future;

        @SuppressWarnings("rawtypes")
		public Entity(Object value, Future future) {
            this.value = value;
            this.future = future;
        }

        /**
         * 获取值
         *
         * @return
         */
        public Object getValue() {
            return value;
        }

        /**
         * 获取Future对象
         *
         * @return
         */
        @SuppressWarnings("rawtypes")
		public Future getFuture() {
            return future;
        }
    }
}

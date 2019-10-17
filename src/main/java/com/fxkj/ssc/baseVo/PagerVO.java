package com.fxkj.ssc.baseVo;

/**
 * 分页
 * 
 * @author Mike -version 1.0
 * @date 2017年8月31日
 */
public class PagerVO {

	/**
	 * @param pageNumber 当前页
	 */
	private Integer pageNumber;

	/**
	 * @param pageSize 每页显示行数
	 */
	private Integer pageSize;
	
	/**
	 * @param totalCount 总记录数
	 */
	private Integer totalCount;

	/**
	 * @param offset 分页记录移动数
	 */
	private Integer offset;

	/**
	 * 获取当前页数
	 * 
	 * @return pageNumber - 当前页数
	 */
	public Integer getPageNumber() {
		if (pageNumber == null) {
			pageNumber = 1;
		}
		return pageNumber;
	}

	/**
	 * 设置当前页数
	 * 
	 * @param pageNumber - 当前页数
	 */
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * 获取每页显示行数
	 * 
	 * @return pageSize - 每页显示行数
	 */
	public Integer getPageSize() {
		if (pageSize == null) {
			pageSize = 10;
		}
		return pageSize;
	}

	/**
	 * 设置每页显示行数
	 * 
	 * @param pageSize
	 *            - 每页显示行数
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	* 获取totalCount
	* 
	* @return totalCount - totalCount
	*/
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	* 设置totalCount
	* 
	* @param totalCount - totalCount
	*/
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * 获取mysql分页查询记录移动数
	 * 
	 * @return offset - mysql分页查询记录移动数
	 */
	public Integer getOffset() {
		this.offset = (getPageNumber() - 1) * getPageSize();
		return offset;
	}

	@Override
	public String toString() {
		return "PageVO [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", totalCount="
				+ totalCount + ", offset=" + offset + "]";
	}

}

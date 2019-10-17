package com.fxkj.ssc.utils.google;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 二维码工具类
 */
public class QRCodeUtils {
    private static final int                         width  = 300;                                  //二维码宽度(默认)
    private static final int                         height = 300;                                  //二维码高度(默认)
    private static final String                      format = "png";                                //二维码文件格式
    private static final Map<EncodeHintType, Object> hints  = new HashMap<EncodeHintType, Object>();//二维码参数

    static {
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");//字符编码
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);//容错等级 H为最高
        hints.put(EncodeHintType.MARGIN, 2);//边距
    }

    /**
     * 返回一个 BufferedImage 对象
     * @param content 二维码内容
     */
    public static BufferedImage toBufferedImage(String content) throws WriterException, IOException {
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

    /**
     * 返回一个 BufferedImage 对象
     * @param content 二维码内容
     * @param width   宽
     * @param height  高
     */
    public static BufferedImage toBufferedImage(String content, int width, int height) throws WriterException, IOException {
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

    /**
     * 将二维码图片输出到一个流中
     * @param content 二维码内容
     * @param stream  输出流
     */
    public static void writeToStream(String content, OutputStream stream) throws WriterException, IOException {
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        MatrixToImageWriter.writeToStream(bitMatrix, format, stream);
    }

    /**
     * 将二维码图片输出到一个流中
     * @param content 二维码内容
     * @param stream  输出流
     * @param width   宽
     * @param height  高
     */
    public static void writeToStream(String content, OutputStream stream, int width, int height) throws WriterException, IOException {
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        MatrixToImageWriter.writeToStream(bitMatrix, format, stream);
    }

    /**
     * 生成二维码图片
     * @param content 二维码内容
     * @param path    文件保存路径
     */
    public static void createQRCode(String content, String path) throws WriterException, IOException {
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        MatrixToImageWriter.writeToPath(bitMatrix, format, new File(path).toPath());
    }

    /**
     * 生成二维码图片
     * @param content 二维码内容
     * @param path    文件保存路径
     * @param width   宽
     * @param height  高
     */
    public static void createQRCode(String content, String path, int width, int height) throws WriterException, IOException {
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        MatrixToImageWriter.writeToPath(bitMatrix, format, new File(path).toPath());
    }

    /**
     * 读二维码并输出携带的信息
     */
    public static String readQrCode(InputStream inputStream) throws IOException {
        //从输入流中获取字符串信息
        BufferedImage image = ImageIO.read(inputStream);
        //将图像转换为二进制位图源
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        QRCodeReader reader = new QRCodeReader();
        Result result = null;
        try {
            result = reader.decode(bitmap);
        } catch (ReaderException e) {
            e.printStackTrace();
        }
        return result.getText();
    }

    /**
     * 读base64并输出携带的信息
     */
    public static String readQrCode(String base64) throws IOException {
        byte[] bytes = new BASE64Decoder().decodeBuffer(base64); //将字符串转换为byte数组
        System.out.println(new String(bytes, "UTF-8"));
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        return QRCodeUtils.readQrCode(in);
    }

    /**
     * 读图片输出携带的信息
     */
    public static String readQrCodeByPicture(String base64) throws IOException {

        if (base64.split("base64,").length > 1) {
            base64 = base64.split("base64,")[1];
        }
        byte[] bytes = new BASE64Decoder().decodeBuffer(base64); //将字符串转换为byte数组
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        return QRCodeUtils.readQrCode(in);
    }

    /**
     * 将文件转成base64 字符串
     *
     * @param
     * @return *
     * @throws Exception
     */
    public static String encodeBase64File(String path) throws Exception {
        File file = new File(path);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return new BASE64Encoder().encode(buffer);
    }

    /**
     * 二维码生成器
     * 
     * @param text
     *            二维码内容
     * @throws IOException
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static String generalQRCode(String url) {
        Hashtable hints = new Hashtable();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        String binary = null;

        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, 200, 200, hints);

            // 实现一： 输出图片到指定目录
            // File outputFile = new File("d://1.jpg");
            // MatrixToImageWriter.writeToFile(bitMatrix, "png", outputFile);

            // 实现二：生成二维码图片并将图片转为二进制传递给前台
            // 1、读取文件转换为字节数组
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            BufferedImage image = toBufferedImage(bitMatrix);
            ////
            ImageIO.write(image, "png", out);
            byte[] bytes = out.toByteArray();

            // 2、将字节数组转为二进制
            BASE64Encoder encoder = new BASE64Encoder();
            binary = encoder.encodeBuffer(bytes).trim();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return binary;
    }

    // 其他调用方法
    public static BufferedImage toBufferedImage(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, matrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
            }
        }
        return image;
    }

}

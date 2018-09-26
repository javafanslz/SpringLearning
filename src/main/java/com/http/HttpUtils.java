package com.http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <dl>
 * <dt> HttpUtils</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/4/28</dd>
 * </dl>
 *
 * @author lizhu
 */
public class HttpUtils {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://weibo.com/1883881851/Gebap3B5U");
        try {
            HttpURLConnection con = (HttpURLConnection )url.openConnection();
            InputStream i = con.getInputStream();
            byte[] b = new byte[1024];
            File file = new File("E:\\log\\a.html");
            OutputStream os = new FileOutputStream(file);
            int len;
            // 开始读取
            while ((len = i.read(b)) != -1) {
                os.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

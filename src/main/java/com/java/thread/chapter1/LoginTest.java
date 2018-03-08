package com.java.thread.chapter1;

/**
 * <dl>
 * <dt> LoginTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/1</dd>
 * </dl>
 *
 * @author lizhu
 */
public class LoginTest {
    public static void main(String[] rags){
        Thread t = new Thread(new ALogin());
        Thread t1 = new Thread(new BLogin());
        t.start();
        t1.start();
    }
}

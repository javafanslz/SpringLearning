package com.java.thread.chapter1;

/**
 * <dl>
 * <dt> ALogin</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/1</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ALogin extends Thread {

    public void run(){
        LoginServlet.doPost("a","aa");
    }
}

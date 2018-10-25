package com.java.thread.wait;

/**
 * <dl>
 * <dt> Test</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Test {

    public static void main(String[] args){
        Object object = new Object();
        new Thread(new ThreadA(object),"A"){}.start();
    }
}

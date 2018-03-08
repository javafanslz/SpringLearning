package com.java.thread.chapter1;

/**
 * <dl>
 * <dt> Run</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/1</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Run {

    public static void main(String[] args){
        MyThread m = new MyThread();
        Thread a = new Thread(m);
        a.setName("A");
        Thread b = new Thread(m);
        b.setName("B");
        Thread c = new Thread(m);
        c.setName("C");

        a.start();
        b.start();
        c.start();
    }
}

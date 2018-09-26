package com.java.thread;

/**
 * <dl>
 * <dt> Test</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/8</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Test {
    public synchronized void test1() throws InterruptedException {
        System.out.println("进入到test");
        System.out.println(Thread.currentThread().getName());
        test2();
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+"执行test结束");
    }

    public   synchronized  void test2() throws InterruptedException {
        System.out.println("进入到test2");
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+"执行test2结束");
    }
}

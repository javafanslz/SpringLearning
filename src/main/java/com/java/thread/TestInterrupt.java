package com.java.thread;

import java.util.concurrent.locks.LockSupport;

/**
 * <dl>
 * <dt> TestInterrupt</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/11/5</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TestThread());
        Thread thread1 = new Thread(new TestThread1(thread));

        thread.start();
        Thread.sleep(1000);
        thread1.start();
    }
}

class TestThread implements Runnable{

    @Override
    public void run() {
        System.out.println("开始执行1");
        LockSupport.park();
        System.out.println("被唤醒");

    }
}

class TestThread1 implements Runnable{
    private Thread thread;
    public TestThread1(Thread thread){
        this.thread = thread;
    }
    @Override
    public void run() {
        System.out.println("开始执行2");
        System.out.println("尝试唤醒1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LockSupport.unpark(thread);
    }
}
package com.java.thread.chapter1;

/**
 * <dl>
 * <dt> CountOperate</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/1</dd>
 * </dl>
 *
 * @author lizhu
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("CountOperate start");
        System.out.println("Thread.currentThread.getName="+Thread.currentThread().getName());
        System.out.println("Thread.isAlive="+Thread.currentThread().isAlive());
        System.out.println("this.getName="+this.getName());
        System.out.println("this.isAlive="+this.isAlive());
        System.out.println("CountOperate end");
    }

    @Override
    public void run(){
        System.out.println("run start");
        System.out.println("Thread.currentThread.getName="+Thread.currentThread().getName());
        System.out.println("Thread.isAlive="+Thread.currentThread().isAlive());
        System.out.println("this.getName="+this.getName());
        System.out.println("this.isAlive="+this.isAlive());
        System.out.println("run end");
    }
}

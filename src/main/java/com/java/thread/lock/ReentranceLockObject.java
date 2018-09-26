package com.java.thread.lock;

import sun.misc.Lock;

/**
 * <dl>
 * <dt> NoReentranceLock</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ReentranceLockObject {
    ReentranceLock lock = new ReentranceLock();


    public void test1(){
        try {
            lock.lock();
            System.out.println(String.format("%s线程进入到了test1方法",Thread.currentThread().getName()));
            Thread.sleep(3000);
            test2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    public void test2(){
        try {
            lock.lock();
            System.out.println(String.format("%s线程进入到了test2方法",Thread.currentThread().getName()));
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

}

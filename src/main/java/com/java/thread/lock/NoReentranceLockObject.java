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
public class NoReentranceLockObject {
    Lock lock = new Lock();

    /**
     * 关键字syncronized是可重入锁，意思是当线程获取到对象锁时，可以进入到该对象的其他加锁的方法，所以是可重入的
     * 方法lock不是可重入的，是因为，当线程获取锁之后，访问对象其他的方法时，Lock在自旋时，一直是true，所以一直在wait
     */
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

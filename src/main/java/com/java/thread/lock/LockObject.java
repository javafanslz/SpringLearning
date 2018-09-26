package com.java.thread.lock;

import sun.misc.Lock;

/**
 * <dl>
 * <dt> LockObject</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class LockObject {
    Lock lock = new Lock();

    public void test(){
        try {
        lock.lock();
        System.out.println(String.format("%s线程进入到了test方法",Thread.currentThread().getName()));
        //do someThing
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s线程离开了test方法",Thread.currentThread().getName()));
        lock.unlock();
    }
}

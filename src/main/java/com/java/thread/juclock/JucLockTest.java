package com.java.thread.juclock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * <dl>
 * <dt> JucLockTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class JucLockTest {
    public void test(){
        AtomicInteger atomicInteger = new AtomicInteger();
        //LockSupport lockSupport = new LockSupport();
        System.out.println(System.nanoTime());
      Lock lock;
    }

    public static void main(String[] args){
        System.out.println(System.nanoTime());
    }
}

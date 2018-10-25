package com.java.thread.juclock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * <dl>
 * <dt> TestABA</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestABA {

    public static void main(final String[] args) throws InterruptedException {
        final AtomicInteger atomicInteger = new AtomicInteger(100);
        final AtomicStampedReference<Integer> reference = new AtomicStampedReference<Integer>(100,0);
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                boolean result = atomicInteger.compareAndSet(100,101);
                System.out.println("线程1修改成了101");
                System.out.println("线程1的修改结果为"+result);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                boolean result1 = atomicInteger.compareAndSet(100,101);
                boolean result2 = atomicInteger.compareAndSet(101,100);
                System.out.println("线程2修改成了");
                System.out.println("线程2的修改结果分别为"+result1+"###"+result2);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                int stamp = reference.getStamp();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                boolean result = reference.compareAndSet(100,101,stamp,stamp+1);
                System.out.println("线程3修改成了101");
                System.out.println("线程3的修改结果为"+result);
            }
        });
        Thread t4 = new Thread(new Runnable() {
            public void run() {
                boolean result1 = reference.compareAndSet(100,101,reference.getStamp(),reference.getStamp()+1);
                boolean result2 = reference.compareAndSet(101,100,reference.getStamp(),reference.getStamp()+1);
                System.out.println("线程4修改成了");
                System.out.println("线程4的修改结果分别为"+result1+"###"+result2);
            }
        });
        t3.start();
        t4.start();

    }
}

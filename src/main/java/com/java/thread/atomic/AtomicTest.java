package com.java.thread.atomic;

import com.java.thread.volatiletest.VolatileObject;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <dl>
 * <dt> AtomicTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/10</dd>
 * </dl>
 *
 * @author lizhu
 */
public class AtomicTest {
    public static void main(String[] args){
        final AtomicDemo volatileDemo = new AtomicDemo();
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        AtomicInteger atomicInteger = new AtomicInteger();
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                public void run() {
                    for(int j=0;j<10000;j++){
                        volatileDemo.increse();
                    }
                    countDownLatch.countDown();
                }
            }).start();
            atomicInteger.getAndIncrement();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行的线程数为："+atomicInteger.get());
        System.out.println(volatileDemo.serNum);
    }
}

/**
 * 使用volatile修饰并不能保证原子性
 * i++
 */
class VolatileDemo{
    public volatile int serNum = 0;

    public void increse(){
        serNum++;
    }
}

class SyscronizedDemo{
    public volatile int serNum = 0;

    public synchronized  void increse(){
        serNum++;
    }
}



class AtomicDemo{
    public AtomicInteger serNum = new AtomicInteger();

    public  void increse(){
        serNum.getAndIncrement();
    }
}

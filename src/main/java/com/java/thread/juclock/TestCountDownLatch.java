package com.java.thread.juclock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * <dl>
 * <dt> TestCountDownLatch</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for(int i=1;i<=5;i++){
            new Thread(new CountDownLatchDemo(countDownLatch),"线程"+i).start();
        }
        countDownLatch.await();
        new Thread(new CountDownMettingDemo()).start();

    }
}
/**
 * 任务线程
 */
class CountDownLatchDemo implements Runnable{
    private CountDownLatch countDownLatch;
    public CountDownLatchDemo(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + "到了，歇1秒");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            countDownLatch.countDown();
        }
    }
}


class CountDownMettingDemo implements Runnable{

    public void run() {
        System.out.println("人到齐了开会吧");
    }
}


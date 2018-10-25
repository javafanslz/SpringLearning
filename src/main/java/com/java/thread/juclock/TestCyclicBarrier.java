package com.java.thread.juclock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <dl>
 * <dt> TestCyclicBarrier</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestCyclicBarrier {
    public static void main(String[] args){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5,new MettingDemo());

        for(int i=1;i<=5;i++){
            new Thread(new CyclicBarrierDemo(cyclicBarrier),"线程"+i).start();
        }
    }
}

/**
 * 任务线程
 */
class CyclicBarrierDemo implements Runnable{
    private CyclicBarrier cyclicBarrier;
    public CyclicBarrierDemo(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+"到了，歇1秒");
        try {
            Thread.sleep(1000);
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}


class MettingDemo implements Runnable{

    public void run() {
        System.out.println("人到齐了开会吧");
    }
}

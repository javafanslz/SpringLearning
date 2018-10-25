package com.java.thread.juclock;

import com.java.thread.wait.ThreadA;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <dl>
 * <dt> TestCondition</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/24</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestCondition {
    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        Product product = new Product(lock);
        for(int i=0;i<20;i++){
            new Thread(new ThreadDemoA(product){},"A").start();
            new Thread(new ThreadDemoB(product){},"B").start();
        }

    }
}


class ThreadDemoA implements Runnable{
    private Product product;
    public ThreadDemoA(Product product){
        this.product = product;
    }
    public void run() {
        product.prod();
    }
}

class ThreadDemoB implements Runnable{
    private Product product;
    public ThreadDemoB(Product product){
        this.product = product;
    }
    public void run() {
        product.cons();
    }
}

class Product{
    int total = 0;
    private Lock lock;
    private  Condition notFullcondition;
    private Condition fullCondition;
    public Product(Lock lock){
       this.lock = lock;
       this.notFullcondition = lock.newCondition();
       this.notFullcondition = lock.newCondition();
    }
    public void prod(){
        lock.lock();
        try {
            if(total>=10){
                try {
                    System.out.println("生产已满");
                    notFullcondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            total++;
            System.out.println(Thread.currentThread().getName()+"生产,现在还有"+total);
            fullCondition.signal();

        }finally {
            lock.unlock();
        }
    }

    public void cons(){
        lock.lock();
        try{
            if(total<=0){
                System.out.println("消费完了");
                fullCondition.signal();
            }
            total--;
            System.out.println(Thread.currentThread().getName()+"消费,现在还有"+total);
            notFullcondition.signal();
        }finally {
            lock.unlock();
        }
    }
}
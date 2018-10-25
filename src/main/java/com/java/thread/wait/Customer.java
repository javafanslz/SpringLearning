package com.java.thread.wait;

import java.util.List;

/**
 * <dl>
 * <dt> Customer</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Customer implements Runnable {
    private Object lock;
    private List<Integer> list;
    private static final int MIN_NUM = 0;
    public Customer(Object lock,List<Integer> list){
        this.lock = lock;
        this.list = list;
    }
    public void run() {
        while (true){
            synchronized (lock){
                if(list.size()==MIN_NUM){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.remove(0);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+ " 消费了： "+ list+" ,产品仓库当前数量： "+ list.size());
                lock.notify();
            }
        }
    }
}

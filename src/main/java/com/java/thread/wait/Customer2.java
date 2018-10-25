package com.java.thread.wait;

import java.util.List;

/**
 * <dl>
 * <dt> Customer2</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Customer2 implements Runnable{
    private List<Integer> list;
    private Object lock;
    private static final int MIN_NUM = 0;
    public Customer2(Object lock,List<Integer> list){
        this.lock = lock;
        this.list = list;
    }

    public void run() {
        while(true){
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
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"消费了"+list+"总数还有"+list.size());
                lock.notify();
            }

        }
    }
}

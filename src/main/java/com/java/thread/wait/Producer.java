package com.java.thread.wait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <dl>
 * <dt> Producer</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Producer implements Runnable {

    private Object lock;

    private List<Integer> list;

    private static final int MAX_NUM = 10;

    public Producer(Object lock, List<Integer> list) {
        this.lock = lock;
        this.list = list;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                if (list.size() == MAX_NUM) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(new Integer(10));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 生产了： " + list + " ,产品仓库当前数量： " + list.size());
                lock.notify();
            }
        }
    }
}

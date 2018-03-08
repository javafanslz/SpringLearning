package com.java.thread.chapter1;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * <dl>
 * <dt> MyThread</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/1</dd>
 * </dl>
 *
 * @author lizhu
 */
public class MyThread extends Thread {
    public int count=5;

    @Override
    public synchronized  void run(){
        if(count>0) {
            count--;
            System.out.println("当前值为"+count+"当前线程为"+Thread.currentThread().getName());
        }
    }

}

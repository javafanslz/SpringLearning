package com.java.lang.thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * <dl>
 * <dt> TestCount</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/10</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestCount {
    public static void main(String[] args) {
        //多线程对于全局变量而言是不安全的
        Runnable runnable = new Runnable() {
            //Count count = new Count();
            @Override
            public void run() {
                Count count = new Count();
                count.count();
            }
        };
        for(int i =0;i<10;i++){
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}

package com.java.thread.wait;

/**
 * <dl>
 * <dt> ThreeadB</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ThreadB implements Runnable {

    private Object lock;

    public ThreadB(Object lock){
        this.lock = lock;
    }
    public void run() {
        synchronized (lock){
            LogUtil.log("get lock");
            new Thread(new ThreadC(lock),"C"){}.start();
            LogUtil.sleep(100);
            LogUtil.log("start notify");
            lock.notify();
            LogUtil.log("release lock");
        }
    }
}

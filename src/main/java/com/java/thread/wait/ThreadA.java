package com.java.thread.wait;

/**
 * <dl>
 * <dt> ThreadA</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ThreadA implements Runnable{

     private Object lock;


     public ThreadA(Object lock){
         this.lock = lock;
     }

    public void run(){
        synchronized (lock){
            LogUtil.log("get lock");
            new Thread(new ThreadB(lock),"B"){}.start();
            LogUtil.log("start wait");
            try {
                lock.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            LogUtil.log("get lock after wait");
            LogUtil.log("release lock");
        }

    }
}

package com.java.thread.lock;

/**
 * <dl>
 * <dt> LockTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class LockTest {
    public static void main(String[] args){
      /*  LockObject lockObject = new LockObject();
        Thread thread = new Thread(new LockThread1(lockObject));
        Thread thread1 = new Thread(new LockThread2(lockObject));
        thread.setName("t1");
        thread1.setName("t2");
        thread.start();
        thread1.start();*/
        ReentranceLockObject lockObject = new ReentranceLockObject();
        Thread thread = new Thread(new LockThread1(lockObject));
        Thread thread1 = new Thread(new LockThread2(lockObject));
        thread.setName("t1");
        thread1.setName("t2");
        thread.start();
        thread1.start();
    }
}

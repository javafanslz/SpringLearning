package com.java.thread.lock;

/**
 * <dl>
 * <dt> ReentranceLock</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ReentranceLock {

    private boolean isLocked = false;
    private int lockCount=0;
    private Thread lockThread;

    /**
     * 如果获取锁的是当线程不阻塞，否则阻塞
     * @throws InterruptedException
     */
    public synchronized void lock() throws InterruptedException {
        Thread thread = Thread.currentThread();
        while(isLocked&&lockThread!=thread){
            wait();
        }
        ++lockCount;
        isLocked = true;
        lockThread = thread;
    }

    /**
     * 当持有锁的是当前锁，且是最后一个unlock就释放锁
     */
    public synchronized void unlock(){
        if(lockThread == Thread.currentThread()){
            lockCount --;
        }
        if(lockCount==0){
            isLocked = false;
            notifyAll();
        }

    }
}

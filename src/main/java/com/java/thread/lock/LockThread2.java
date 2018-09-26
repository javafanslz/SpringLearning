package com.java.thread.lock;

/**
 * <dl>
 * <dt> LockThread2</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class LockThread2 implements Runnable {
    ReentranceLockObject lockObject;
    public LockThread2(ReentranceLockObject lockObject){
        this.lockObject = lockObject;
    }
    public void run() {
        lockObject.test1();
    }
}

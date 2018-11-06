package com.java.thread.juclock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <dl>
 * <dt> TestReentrantLock</dt>
 * <dd>Description:测试reentrantlock中的一些方法</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/27</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestReentrantLock {
    public static void main(String[] args){
        Lock lock = new ReentrantLock();
    }
}

class ReentrantLockThread implements Runnable{
   private ReentrantLockDemo reentrantLockDemo;
    public ReentrantLockThread(ReentrantLockDemo reentrantLockDemo){
        this.reentrantLockDemo = reentrantLockDemo;
    }
    public void run() {
        int x = new Random().nextInt(5);
        reentrantLockDemo.setI(x);
    }
}

class ReentrantLockDemo {
    private int i;
    public void setI(int i){
        this.i = i;
    }
    public int getI(){
        return i;
    }
}

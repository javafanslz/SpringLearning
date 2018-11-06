package com.java.thread.juclock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <dl>
 * <dt> TestFairAndNonFairLock</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/11/5</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestFairAndNonFairLock {
    public static void main(String[] args){
        MyReentrantLock  fairLock = new MyReentrantLock(true);
        MyReentrantLock nonFairLock = new MyReentrantLock(false);
        MyPrinter myPrinter = new MyPrinter(nonFairLock);

        //ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
           new Thread(new MyJob(myPrinter),String.valueOf(i)).start();
        }

    }
}


class MyReentrantLock extends ReentrantLock{
    public MyReentrantLock(boolean fair){
        super(fair);
    }

    public Collection<Thread> getQueueThread(){
        List<Thread> list = new ArrayList<Thread>(super.getQueuedThreads());
        Collections.reverse(list);
        return list;
    }
}

class MyJob implements Runnable{
    private MyPrinter myPrinter;
    public MyJob(MyPrinter myPrinter){
        this.myPrinter = myPrinter;
    }
    public void run(){
        myPrinter.printer();
        myPrinter.printer();

    }
}

class MyPrinter{
    public MyReentrantLock myReentrantLock;
    public MyPrinter(MyReentrantLock myReentrantLock){
        this.myReentrantLock = myReentrantLock;
    }
    public void printer(){
        myReentrantLock.lock();
        try{
            Thread.sleep(100);
            System.out.println("Lock by " + Thread.currentThread().getName()+" Waiting by "+myReentrantLock.getQueueThread());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            myReentrantLock.unlock();
        }
    }
}


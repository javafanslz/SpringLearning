package com.java.thread.lock;

import com.java.lang.wait.WaitThread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <dl>
 * <dt> TestReentrantReadWriteLock</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/28</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestReentrantReadWriteLock {
    public static void main(String[] args) {
        Cache cache = new Cache();

        Thread r1 = new Thread(new ReadThread(cache,0,5),"r1");
        Thread r2 = new Thread(new ReadThread(cache,5,10),"r2");
        Thread w1 = new Thread(new WriteThread(cache),"w1");
        Thread w2 = new Thread(new CleanThread(cache),"w2");

       // w1.start();
       /* r1.start();
        r2.start();*/
        //w2.start();
        int state = 0;
        state = state + (1<<16);
        System.out.println(state >>> 16);
    }
}

class Cache{

    private Map<String,String> map = new HashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock read = lock.readLock();
    private Lock write = lock.writeLock();

    public String getData(String key){
        read.lock();
        try{
            return map.get(key) !=null?map.get(key):null;
        }finally {
            read.unlock();
        }

    }

    public void setData(String key,String value){
        write.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"开始添加数据数据"+key+":"+value);
            map.put(key,value);
        }finally {
            write.unlock();
        }
    }

    public void cleanData(){
        write.lock();
        lock.getReadLockCount();
        System.out.println(Thread.currentThread().getName()+"开始清理数据");
        try{
            map.clear();
        }finally {
            System.out.println(Thread.currentThread().getName()+"清理结束");
            write.unlock();
        }
    }
}

class ReadThread implements Runnable{

    private Cache cache;
    private int start;
    private int end;
    public ReadThread(Cache cache,int start,int end){
        this.cache = cache;
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for(int i = start;i<end;i++){
            String value = cache.getData(String.valueOf(i));
            System.out.println(Thread.currentThread().getName()+"获取到的值为"+value);
        }
    }
}

class WriteThread implements Runnable{
    private Cache cache;
    public WriteThread(Cache cache){
        this.cache = cache;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            cache.setData(String.valueOf(i),String.valueOf(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"存数据结束");

    }
}

class CleanThread implements Runnable{
    private Cache cache;
    public CleanThread(Cache cache){
        this.cache = cache;
    }
    @Override
    public void run() {
        cache.cleanData();
    }
}



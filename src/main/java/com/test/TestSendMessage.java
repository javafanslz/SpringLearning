package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <dl>
 * <dt> TestSendMessage</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/29</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestSendMessage {
    public static void main(String[] args){
        final CyclicBarrier barrier = new CyclicBarrier(100000, new Runnable() {
            @Override
            public void run() {
                System.out.println("运行结束，值应该为");
                Iterator<String> it = SendConfig.newMap.keySet().iterator();
                while(it.hasNext()){
                    String key = it.next();
                    System.out.println(key);
                    System.out.println(SendConfig.newMap.get(key));
                }
                System.out.println("执行总次数为"+SendConfig.times.get());

            }
        });
        for(int i=0;i<100000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SendConfig.getNextUrlJuc());
                    try {
                        barrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }

}

class SendConfig{
    public static ConcurrentHashMap<String,Long> newMap = new ConcurrentHashMap<>();
    public static Map<String,Double> prob = new HashMap<String,Double>();
    public static volatile AtomicLong times = new AtomicLong(0);
    private static ReentrantLock lock = new ReentrantLock();

    static {
        newMap.put("a",0L);
        newMap.put("b",0L);
        prob.put("a",0.3);
        prob.put("b",0.7);
    }

    public synchronized static String getNextUrl(){
        Iterator<String> it = newMap.keySet().iterator();
        while(it.hasNext()){
            String url = it.next();
            Long val = newMap.get(url);
            Long total = times.get();
            Double d = prob.get(url);
            double should = total * d;
            if(Double.valueOf(val)<=should){
                newMap.put(url,val+1);
                times.getAndIncrement();
                return url;
            }
            continue;

        }
        return "";
    }

    /**
     *
     * @return
     */
    public static String getNextUrlJuc(){
        lock.lock();
        try{
            Iterator<String> it = newMap.keySet().iterator();
            while(it.hasNext()){
                String url = it.next();
                Long val = newMap.get(url);
                Long total = times.get();
                Double d = prob.get(url);
                double should = total * d;
                if(Double.valueOf(val)<=should){
                    newMap.put(url,val+1);
                    times.getAndIncrement();
                    return url;
                }
                continue;

            }
            return "";
        }finally {
            lock.unlock();
        }
    }
}
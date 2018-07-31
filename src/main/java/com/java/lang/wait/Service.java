package com.java.lang.wait;

/**
 * <dl>
 * <dt> Service</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/7/31</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Service {

    public void sleepTest(){
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName()+"sleep开始时间"+System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("开始测试sleep");
                System.out.println(Thread.currentThread().getName()+"执行结束时间"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void waitTest(){
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName()+"sleep开始时间"+System.currentTimeMillis());
                this.wait(3000);
                System.out.println("测试wait");
                System.out.println(Thread.currentThread().getName()+"sleep开始时间"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

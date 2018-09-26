package com.java.thread.volatiletest;

/**
 * <dl>
 * <dt> VolatileObject</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class VolatileObject {
    public boolean bol=false;

    public void test(){
        while(!bol){
            System.out.println("正在执行中");
        }
        System.out.println(Thread.currentThread().getName()+"执行结束");
    }

    public void test2(){
        System.out.println("进入到了Test2中");
        bol = true;
        try {
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+"执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

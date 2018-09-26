package com.java.thread.volatiletest;

/**
 * <dl>
 * <dt> VolatileTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class VolatileTest {
    public static void main(String[] args){
        VolatileObject volatileObject =  new VolatileObject();
        VolatileThread1 t1 = new VolatileThread1(volatileObject);
        t1.setName("T1");
        Thread t2 = new Thread(new VolatileThread2(volatileObject));
        t2.setName("T2");
        t1.start();
        t2.start();
    }
}

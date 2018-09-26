package com.java.thread.volatiletest;

/**
 * <dl>
 * <dt> VolatileThread1</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class VolatileThread1 extends Thread {
    private VolatileObject volatileObject;
    public VolatileThread1(VolatileObject volatileObject){
        this.volatileObject = volatileObject;
    }
    @Override
    public void run(){
        volatileObject.test();
    }
}

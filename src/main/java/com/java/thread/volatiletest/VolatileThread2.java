package com.java.thread.volatiletest;

/**
 * <dl>
 * <dt> VolatileThread2</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class VolatileThread2 implements Runnable {
    private VolatileObject volatileObject;
    public VolatileThread2(VolatileObject volatileObject){
        this.volatileObject = volatileObject;
    }
    public void run() {
        volatileObject.test2();
    }
}

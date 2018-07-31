package com.java.lang.wait;

/**
 * <dl>
 * <dt> WaitThread</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/7/31</dd>
 * </dl>
 *
 * @author lizhu
 */
public class WaitThread implements Runnable{
    private Service service;
    public WaitThread(Service service){
        this.service = service;
    }
    public void run() {
        service.waitTest();
    }
}

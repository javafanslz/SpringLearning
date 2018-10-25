package com.java.thread.wait;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * <dl>
 * <dt> LogUtil</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class LogUtil {

    public static void sleep(long sleepVal){
        try{
            Thread.sleep(sleepVal);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void log(String desc){
        System.out.println(Thread.currentThread().getName() + " : " + desc);
        //AbstractQueuedSynchronizer
    }
}

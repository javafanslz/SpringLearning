package com.java.thread;

/**
 * <dl>
 * <dt> MoreSysThread</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/20</dd>
 * </dl>
 *
 * @author lizhu
 */
public class MoreSysThread extends  Thread {
    private Test test;
    public MoreSysThread(Test test){
        this.test = test;
    }
    public void run(){
        try {
            test.test1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

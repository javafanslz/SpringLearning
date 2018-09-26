package com.java.thread;

/**
 * <dl>
 * <dt> MoreSysThread2</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/20</dd>
 * </dl>
 *
 * @author lizhu
 */
public class MoreSysThread2 extends  Thread{
    private Test test;
    public MoreSysThread2(Test test){
        this.test = test;
    }

    public void run(){
        try {
            test.test2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

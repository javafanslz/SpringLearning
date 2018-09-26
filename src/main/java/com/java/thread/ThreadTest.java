package com.java.thread;

/**
 * <dl>
 * <dt> ThreadTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/2/28</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ThreadTest {
    public static void main(String[] args){
        Test test = new Test();
       MoreSysThread moreSysThread = new MoreSysThread(test);
       MoreSysThread2 moreSysThread2 = new MoreSysThread2(test);
       moreSysThread.setName("t1");
       moreSysThread2.setName("t2");
       moreSysThread.start();
       moreSysThread2.start();
    }
}

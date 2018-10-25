package com.java.thread.happensbefore;

/**
 * <dl>
 * <dt> ThreadA</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ThreadA implements  Runnable {
    private DemoPo demoPo;

    public ThreadA(DemoPo demoPo){
        this.demoPo = demoPo;
    }

    public void run() {
        demoPo.write(10);
    }
}

package com.java.thread.happensbefore;

/**
 * <dl>
 * <dt> ThreadB</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ThreadB implements Runnable {
    private DemoPo demoPo;
    public ThreadB(DemoPo demoPo){
        this.demoPo = demoPo;
    }
    public void run() {
        demoPo.read();
    }
}

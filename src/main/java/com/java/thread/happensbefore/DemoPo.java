package com.java.thread.happensbefore;

/**
 * <dl>
 * <dt> DemoPo</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class DemoPo {
    private volatile int i;

    public void write(int j){
        i = j;
        System.out.println(Thread.currentThread().getName()+"把数据更新为"+i);
    }

    public int read(){
        int k = i;
        System.out.println(Thread.currentThread().getName()+"读取数据为"+k);
        return k;
    }

}

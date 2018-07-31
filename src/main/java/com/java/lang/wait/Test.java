package com.java.lang.wait;

/**
 * <dl>
 * <dt> Test</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/7/31</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Test {
    public static void main(String[] args){
        Service service = new Service();
        Thread thread = new Thread(new WaitThread(service));
        thread.setName("t1");
        Thread thread1 = new Thread(new WaitThread(service));
        thread1.setName("t2");
        thread.start();
        thread1.start();
    }
}

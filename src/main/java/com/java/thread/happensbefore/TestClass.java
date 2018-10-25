package com.java.thread.happensbefore;

/**
 * <dl>
 * <dt> TestClass</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/9/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestClass {
    public static void main(String[] args){
            DemoPo demoPo = new DemoPo();
            Thread thread = new Thread(new ThreadA(demoPo));
            thread.setName("ThreadA");
            thread.setPriority(6);
            Thread thread1 = new Thread(new ThreadB(demoPo));
            thread1.setName("ThreadB");
            thread1.setPriority(5);
            thread.start();
            thread1.start();
    }
}

package com.java.thread;

/**
 * <dl>
 * <dt> StaticThreadTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/11/2</dd>
 * </dl>
 *
 * @author lizhu
 */
public class StaticThreadTest {
    public static void main(String[] args) {
        for(int i=0;i<30;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    StaticThreadDemo.say();
                }
            }).start();
        }
    }
}


class StaticThreadDemo{
    static {
        System.out.println(Thread.currentThread().getName()+"开始加载了");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("加载结束了");
    }

    public static void say(){
        System.out.println(Thread.currentThread().getName()+"开始执行say");
    }


}

package com.java.lang.thread;

/**
 * <dl>
 * <dt> TraditionalThreadSynchronized</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/10</dd>
 * </dl>
 *  传统的线程同步
 * @author lizhu
 */
public class TraditionalThreadSynchronized {
    public static void main(String[] args) {
        final OutPuter outPuter = new OutPuter();
        new Thread(){
            @Override
          public void run(){
                outPuter.outPut("zhangsan");
          }
        }.start();
        new Thread(){
            @Override
            public void run(){
                outPuter.outPut("lisi");
            }
        }.start();
    }
}

class OutPuter{
    public synchronized void outPut(String name){
            for(int i=0;i<name.length();i++){
                System.out.print(name.charAt(i));
            }
    }
}

package com.java.lang.wait;

/**
 * <dl>
 * <dt> Service</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate:2018/7/31</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Service {

    public void sleepTest(){
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName()+"sleep��ʼʱ��"+System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("��ʼ����sleep");
                System.out.println(Thread.currentThread().getName()+"ִ�н���ʱ��"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void waitTest(){
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName()+"sleep��ʼʱ��"+System.currentTimeMillis());
                this.wait(3000);
                System.out.println("����wait");
                System.out.println(Thread.currentThread().getName()+"sleep��ʼʱ��"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

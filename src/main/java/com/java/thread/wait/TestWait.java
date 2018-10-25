package com.java.thread.wait;

import java.util.ArrayList;
import java.util.List;

/**
 * <dl>
 * <dt> TestWait</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestWait {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        Object lock = new Object();
        new Thread(new Producer(lock,list),"PRODUCER"){}.start();
        new Thread(new Customer(lock,list),"CUSTOMER"){}.start();
        new Thread(new Customer(lock,list),"CUSTOMER2"){}.start();

    }
}

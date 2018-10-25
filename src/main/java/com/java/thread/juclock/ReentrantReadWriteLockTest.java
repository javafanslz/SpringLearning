package com.java.thread.juclock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <dl>
 * <dt> ReentrantReadWriteLockTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/22</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ReentrantReadWriteLockTest {

    public static void main(String[] args){
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        System.out.println(1<<16);
        int mask =( 1<<16 )-1 ;
        System.out.println(mask);
        System.out.println(8&mask);
        int mask2 = 16;
         final int SHARED_SHIFT   = 16;
         final int SHARED_UNIT    = (1 << SHARED_SHIFT);
         final int MAX_COUNT      = (1 << SHARED_SHIFT) - 1;
         final int EXCLUSIVE_MASK = (1 << SHARED_SHIFT) - 1;
         int c = 11;
         c = c+SHARED_UNIT;
        System.out.println(c>>>SHARED_SHIFT);
    }
}

class ReadDemo{

}

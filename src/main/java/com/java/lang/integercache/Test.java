package com.java.lang.integercache;

/**
 * <dl>
 * <dt> Test</dt>
 * <dd>Description:测试Integer缓存池的大小</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/7/30</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Test {
    public static void main(String[] args){
        Integer i = 2;
        Integer j = 2;
        int a = 1;
        int b = 1;
        System.out.println(i==j);//t
        System.out.println(a==b);//t
        System.out.println(i.equals(j));//t
        Integer i1 = new Integer(2);
        Integer i2 = new Integer(2);
        System.out.println(i1==i2);//f
        System.out.println(i1.equals(i2));//t
    }
}

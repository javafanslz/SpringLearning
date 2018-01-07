package com.javareflect;

/**
 * <dl>
 * <dt>ClassLoadTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/18</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ClassLoadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}

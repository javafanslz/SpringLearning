package com.java.clone;

import java.io.*;

/**
 * <dl>
 * <dt> Test</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/9</dd>
 * </dl>
 *测试深clone还是浅clone
 * @author lizhu
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person(23,new String("李柱"));
        Person p1 = (Person)p.clone();
        //true
        System.out.println(p.getAge() == p1.getAge());
        //true  浅拷贝
        System.out.println(p1.getName() == p1.getName());

        //
        Body body = new Body(new Head());
        Body body1 = (Body)body.clone();
        System.out.println(body == body1);
        //如果要使Body对象在clone时进行深拷贝， 那么就要在Body的clone方法中，将源对象引用的Head对象也clone一份。
        System.out.println(body.head == body1.head);

    }
}

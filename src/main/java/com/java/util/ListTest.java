package com.java.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * <dl>
 * <dt> LIstTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/8</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ListTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
     /**擦除
      * 在编译期间，所有的泛型信息都会被擦除，List<Integer>和List<String>类型，
      * 在编译后都会变成List类型（原始类型）。Java中的泛型基本上都是在编译器这个
      * 层次来实现的，这也是Java的泛型被称为“伪泛型”的原因。
      * */
     ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        System.out.println(arrayList.getClass() == arrayList1.getClass());

        List<Cat> list = new ArrayList<Cat>();
        list.add(new Cat());
        List<Dog> list1 = new ArrayList<Dog>();
        list1.add(new Dog());
        List<? extends Animal> animals = new ArrayList<Cat>();

    }
}


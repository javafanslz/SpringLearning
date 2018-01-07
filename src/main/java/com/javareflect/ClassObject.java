package com.javareflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * <dl>
 * <dt>ClassObject</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/18</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ClassObject {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.javareflect.TestPo");
            Class clazz2 =  TestPo.class;
            TestPo testPo = new TestPo();
            Class clazz3 = testPo.getClass();
//            System.out.println(clazz3 ==clazz2);
            //获取实例   使用的是无参构造方法
            clazz.getInterfaces();
            Field[] fields = clazz.getFields();
            Field[] fields2 = clazz.getDeclaredFields();
            //System.out.println(fields.toString());
            System.out.println(Modifier.toString(clazz.getModifiers()));
            System.out.println(clazz.getSimpleName());
            for(Field field:fields){
                System.out.println(field.getName());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

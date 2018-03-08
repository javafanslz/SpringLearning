package com.java.enumpackage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * <dl>
 * <dt> Reflection</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/12</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Reflection {
    /**
     * enum类中的values方法是编译器添加的static方法 编译器也添加了valueOf()方法  只有一个参数
     * 由于values方法是有编译器插入进去的static方法 所以向上转型无法获得
     * 可使用Class的getEnumConstants方法获取
     * @param enumClass
     * @return
     */
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("开始分析"+enumClass);
        System.out.print("Interface:");
        for(Type type:enumClass.getGenericInterfaces()){
            System.out.println(type);
        }
        System.out.println("Base:"+enumClass.getSuperclass());
        System.out.println("Method:");
        Set<String> methods = new TreeSet<String>();
        for(Member member:enumClass.getMethods()){
            methods.add(member.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) throws IOException {
        Set<String> method = analyze(EnumClass.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println(method.containsAll(enumMethods));
        method.removeAll(enumMethods);
        System.out.println(method);
        //使用 javap命令执行 EnumClass
       /* public final class com.java.enumpackage.EnumClass extends java.lang.Enum<com.java.enumpackage.EnumClass> {
            public static final com.java.enumpackage.EnumClass NOT;
            public static final com.java.enumpackage.EnumClass MILD;
            public static final com.java.enumpackage.EnumClass NEDIUM;
            public static final com.java.enumpackage.EnumClass HOT;
            public static final com.java.enumpackage.EnumClass FIAMING;
            public static com.java.enumpackage.EnumClass[] values();
        public static com.java.enumpackage.EnumClass valueOf(java.lang.String);
        public java.lang.String toString();
        static {};
}*/
    }
}

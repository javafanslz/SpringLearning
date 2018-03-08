package com.javareflect;

/**
 * <dl>
 * <dt> GetAllImpl</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/26</dd>
 * </dl>
 * 使用反射得到所有类的实现类
 * @author lizhu
 */
public class GetAllImpl {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class.forName("com.javareflect.CarInterface");
    }
}

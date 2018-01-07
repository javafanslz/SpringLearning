package com.javareflect;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <dl>
 * <dt>ReflectTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/18</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ReflectTest {
    public static Car initDefaultConst() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.javareflect.Car");

        Constructor constructor = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car)constructor.newInstance();

        Method setBrand = clazz.getDeclaredMethod("setBrand",String.class);
        setBrand.invoke(car,"红旗");
        Method setColor = clazz.getDeclaredMethod("setColor",String.class);
        setColor.invoke(car,"黑色");
        Method setMaxSpeed = clazz.getDeclaredMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,200);

        Constructor anotherConst = clazz.getDeclaredConstructor(String.class,String.class,int.class,String.class);
        Car anotherCar = (Car)anotherConst.newInstance("奔驰","红色",3000,"测试的全局变量");
        System.out.println(anotherCar.testField);
       // System.out.println((String) clazz.getDeclaredField("color").get(""));
       // System.out.println(clazz.getFields().length);
        return car;
        }

    /**
     * 测试绕过private 的
     */
    public static  Car testPrivate() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz  = classLoader.loadClass("com.javareflect.Car");
        Constructor constructor = clazz.getDeclaredConstructor((Class[])null);
        Car priCar = (Car)constructor.newInstance();

        Field field = clazz.getDeclaredField("color");
        field.setAccessible(true);
        field.set(priCar,"褐色");
        return priCar;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Car car = initDefaultConst();
        car.introduce();
        Car priCar = testPrivate();
        priCar.introduce();

    }
}


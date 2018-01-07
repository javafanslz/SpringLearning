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
 * <dd>Company: ��ţ���������������޹�˾</dd>
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
        setBrand.invoke(car,"����");
        Method setColor = clazz.getDeclaredMethod("setColor",String.class);
        setColor.invoke(car,"��ɫ");
        Method setMaxSpeed = clazz.getDeclaredMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,200);

        Constructor anotherConst = clazz.getDeclaredConstructor(String.class,String.class,int.class,String.class);
        Car anotherCar = (Car)anotherConst.newInstance("����","��ɫ",3000,"���Ե�ȫ�ֱ���");
        System.out.println(anotherCar.testField);
       // System.out.println((String) clazz.getDeclaredField("color").get(""));
       // System.out.println(clazz.getFields().length);
        return car;
        }

    /**
     * �����ƹ�private ��
     */
    public static  Car testPrivate() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz  = classLoader.loadClass("com.javareflect.Car");
        Constructor constructor = clazz.getDeclaredConstructor((Class[])null);
        Car priCar = (Car)constructor.newInstance();

        Field field = clazz.getDeclaredField("color");
        field.setAccessible(true);
        field.set(priCar,"��ɫ");
        return priCar;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Car car = initDefaultConst();
        car.introduce();
        Car priCar = testPrivate();
        priCar.introduce();

    }
}


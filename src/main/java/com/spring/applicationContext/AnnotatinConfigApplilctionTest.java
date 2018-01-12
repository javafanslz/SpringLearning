package com.spring.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @Author: lizhu
 * @ClassName: AnnotatinConfigApplilctionTest
 * @Desciption:
 * @Date:2018/1/7
 * spring使用AnnotionConfigApplitionContext启动注解的spring类
 */
public class AnnotatinConfigApplilctionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBean.class);
        Car car = applicationContext.getBean("car",Car.class);
        System.out.println(car.toString());
    }
}

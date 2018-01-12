package com.spring.applicationContext;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by lizhu on 2018/1/7.
 */
@Configurable
public class AnnotationBean {

    @Bean(name = "car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("∫Ï∆Ï");
        car.setSpeed(200);
        return car;
    }
}

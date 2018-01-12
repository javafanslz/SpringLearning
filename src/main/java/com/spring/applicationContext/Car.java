package com.spring.applicationContext;

/**
 * @Author: lizhu
 * @ClassName: Car
 * @Desciption: Date:2018/1/7
 */
public class Car {
    private String brand;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}

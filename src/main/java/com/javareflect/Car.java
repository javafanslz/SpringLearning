package com.javareflect;

/**
 * <dl>
 * <dt>Car</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/18</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Car {
    private String brand;
    private String color;
    private int maxSpeed;

    public String testField;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(){}
    public Car(String brand,String color,int maxSpeed,String testField){
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.testField = testField;
    }
    public void introduce(){
        System.out.println(String.format("brand="+brand+"color="+color+"maxSpeed="+maxSpeed));
    }
}

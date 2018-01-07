package com.sjms.Decorator;

/**
 * <dl>
 * <dt>Drink</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/26</dd>
 * </dl>
 * 装饰者模式
 * @author lizhu
 */
public abstract class Drink {
    private String description = "";
    private float price;

    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return this.price;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public abstract float cost();
}

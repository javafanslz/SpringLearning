package com.sjms.Decorator;

/**
 * <dl>
 * <dt>Drink</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/26</dd>
 * </dl>
 * װ����ģʽ
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

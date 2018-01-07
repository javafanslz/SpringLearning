package com.sjms.Decorator.decorator;

import com.sjms.Decorator.Drink;

/**
 * <dl>
 * <dt>Decorator</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Decorator extends Drink {
    private Drink drink;
    public Decorator(Drink drink){
        this.drink = drink;
    }
    public float cost() {
        return super.getPrice()+drink.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"&&"+drink.getDescription();
    }
}

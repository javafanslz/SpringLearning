package com.sjms.Decorator;

import com.sjms.Decorator.Coffice.Decof;
import com.sjms.Decorator.Coffice.LongBlack;
import com.sjms.Decorator.decorator.Milk;
import com.sjms.Decorator.decorator.Soy;

/**
 * <dl>
 * <dt>CofficeBar</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class CofficeBar {

    public static void main(String[] args){
        Drink drink = new Decof();
        System.out.println(drink.cost());
        System.out.println(drink.getDescription());
        Drink order = new LongBlack();
        order = new Milk(order);
        order = new Soy(order);
        System.out.println(order.cost());
        System.out.println(order.getDescription());
    }
}

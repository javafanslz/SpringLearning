package com.sjms.Decorator.decorator;

import com.sjms.Decorator.Drink;

/**
 * <dl>
 * <dt>Milk</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Mikl");
        super.setPrice(3.0f);
    }
}

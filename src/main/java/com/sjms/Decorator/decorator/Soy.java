package com.sjms.Decorator.decorator;

import com.sjms.Decorator.Drink;

/**
 * <dl>
 * <dt>Soy</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Soy extends  Decorator{
    public Soy(Drink drink) {
        super(drink);
        super.setDescription("Soy");
        super.setPrice(5.0f);
    }
}

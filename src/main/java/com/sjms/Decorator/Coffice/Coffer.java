package com.sjms.Decorator.Coffice;

import com.sjms.Decorator.Drink;

/**
 * <dl>
 * <dt>Coffer</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/26</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Coffer extends Drink {

    public float cost() {
        return super.getPrice();
    }
}

package com.spring.beantest.impl;

import com.spring.Axe;
import com.spring.Person;

/**
 * <dl>
 * <dt>Chinese</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/16</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Chinese implements Person {
    private Axe axe;
    public void setAxe(Axe axe){
        this.axe = axe;
    }
    @Override
    public void userAxe() {
        System.out.println(axe.chop());
    }
}

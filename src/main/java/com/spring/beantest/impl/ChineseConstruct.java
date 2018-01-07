package com.spring.beantest.impl;

import com.spring.Axe;
import com.spring.Person;

/**
 * <dl>
 * <dt>ChineseConstruct</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/17</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ChineseConstruct implements Person {
    private Axe axe;
    private String name;
    public ChineseConstruct(){

    }

    public ChineseConstruct(Axe axe,String name){
        this.axe = axe;
        this.name = name;
    }
    @Override
    public void userAxe() {
        System.out.println(axe.chop());
        System.out.println(name);
    }
}

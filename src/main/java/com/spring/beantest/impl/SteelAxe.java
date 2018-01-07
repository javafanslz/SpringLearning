package com.spring.beantest.impl;

import com.spring.Axe;

/**
 * <dl>
 * <dt>SteelAxe</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/17</dd>
 * </dl>
 *
 * @author lizhu
 */
public class SteelAxe implements Axe {
    @Override
    public String chop() {
        return "钢斧砍柴真快";
    }
}

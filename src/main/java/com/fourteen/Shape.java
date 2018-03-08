package com.fourteen;

/**
 * <dl>
 * <dt> Shape</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/2/2</dd>
 * </dl>
 *
 * @author lizhu
 */
public abstract class Shape {

    public void draw(){
        System.out.println(this+".draw");
    }
    @Override
    abstract public String toString();

}

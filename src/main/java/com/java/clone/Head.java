package com.java.clone;

/**
 * <dl>
 * <dt> Head</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/9</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Head implements Cloneable{
    public Face face;
    public Head(){}
    public Head(Face face){
        this.face = face;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

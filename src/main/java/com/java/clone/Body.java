package com.java.clone;

/**
 * <dl>
 * <dt> Body</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/9</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Body implements Cloneable {
    public Head head;
    public Body() {}

    public Body(Head head) {this.head = head;}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Body body = (Body)super.clone();
        body.head = (Head) body.head.clone();
        return body;
    }
}

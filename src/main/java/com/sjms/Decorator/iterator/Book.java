package com.sjms.Decorator.iterator;

/**
 * <dl>
 * <dt> Book</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/2/5</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Book {
    private String name;
    public Book(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

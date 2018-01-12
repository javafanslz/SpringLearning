package com.java.enumpackage;

/**
 * <dl>
 * <dt> EnumToString</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/12</dd>
 * </dl>
 *本实例主要是对enum中的方法进行覆盖
 * @author lizhu
 */
public enum EnumToString {
    /**
     *
     */
    SCOUT,
    /**
     *
     */
    TRANSPORT;

    /**
     * enum中的方法覆盖和class中的没有什么不同
     * @return
     */
    @Override
    public String toString(){
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return  id.charAt(1)+lower;
    }
    public static void main(String[] args){
        for(EnumToString toString:EnumToString.values()){
            System.out.println(toString);
        }
    }
}

package com.java.enumpackage;

/**
 * <dl>
 * <dt> EnumWithConstruct</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/12</dd>
 * </dl>
 *enum不能够继承
 * @author lizhu
 */
public enum  EnumWithConstruct {
    //想要创建自己的方法 必须要有一个分号
    //任何定义都得在enmu实例定义之后
    WEST("THE WEST OF CHINA"),EAST("THE EAST");
    private String desp;

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }
    //一旦enum定义结束，编译器就不许使用其他构造器创建实例
    EnumWithConstruct(String desp){
        this.desp = desp;
    }

    public static void main(String[] args){
        for(EnumWithConstruct construct:EnumWithConstruct.values()){
            System.out.println(construct.getDesp());
        }
    }

}

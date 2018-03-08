package com.fourteen.second2;

/**
 * <dl>
 * <dt> ClassTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/2/2</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ClassTest {
    public static void main(String[] args) {
        System.out.println("start");
        new Candy();
        System.out.println("after candy");
        try{
            Class.forName("com.fourteen.second2.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("class forname error");
        }
    }
}
class Candy{
    static {
        System.out.println("loading Candy");
    }
}

class Gum{
    static {
        System.out.println("load Gum");
    }
}


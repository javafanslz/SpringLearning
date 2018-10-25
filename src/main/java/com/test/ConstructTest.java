package com.test;

/**
 * <dl>
 * <dt> ConstructTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/10/10</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ConstructTest extends  ConstructDemo{
    public static void main(String[] args){
        ConstructDemo ConstructDemo = new ConstructDemo();
    }

}

class ConstructDemo{
    private static int i = 0;
    protected ConstructDemo(){
        System.out.println(i);
    }
}

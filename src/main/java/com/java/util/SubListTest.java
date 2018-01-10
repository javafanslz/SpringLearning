package com.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <dl>
 * <dt> SubListTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/10</dd>
 * </dl>
 *
 * @author lizhu
 */
public class SubListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("lizhu");
        list.add("hah");
        List<String> result= list.subList(0,1);
        result.add("erw");
        for(String str:result){
            System.out.println(str);
        }
        for(String str:list){
            System.out.println(str);
        }

        String[] str = {"1","3","4"};
        List<String> test = Arrays.asList(str);
        //Array使用的是适配器模式  只是把数组转换我集合  实际上还是数组
        test.add("7");
    }
}

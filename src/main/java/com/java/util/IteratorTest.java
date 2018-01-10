package com.java.util;

import java.util.ArrayList;
import java.util.List;

/**
 * <dl>
 * <dt> IteratorTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/10</dd>
 * </dl>
 *
 * @author lizhu
 */
public class IteratorTest {
    public static void main(String[] args) {
        //使用foreach循环的时候  默认创建一个itrator romove的时候会判断modCount != expectedModCount  list remove的时候不会修改状态
        //http://blog.csdn.net/bimuyulaila/article/details/52088124
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        for(String str:list){
            //其实会调用两次   1 hasNext 2 next
            if("2".equals(str)){
                list.remove(str);
            }
            //hasNext
            //next
        }
    }
}

package com.java.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <dl>
 * <dt> EntryTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/10</dd>
 * </dl>
 *
 * @author lizhu
 */
public class EntryTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","llizhu");
        map.put("sex","nan");
        Set<String> keySet = map.keySet();
        for(String str:keySet){
            System.out.println(map.get(str));
        }

       Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> entry:set){
            System.out.println(entry.getValue());
        }

    }
}

package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * <dl>
 * <dt>Test</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ?????????????????????</dd>
 * <dd>CreateDate: 2017/12/28</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Test {
     public static void main(String[] args) throws ParseException {
         System.out.println(UUID.randomUUID().toString());

         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         Date date = new Date(Long.parseLong("1492197220"));
         System.out.println(date);
     }
}

class MethodTest{
    public void test(String str,long l){
        //System.out.println(str,l);
    }
}

package com.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <dl>
 * <dt>DateTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/29</dd>
 * </dl>
 *
 * @author lizhu
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dateq = new Date();
       // Date parseDate = simpleDateFormat.parse("1497974400000");
        Date date = new Date(Long.parseLong("1497974400000"));
        System.out.println(simpleDateFormat.format(date));
    }
}

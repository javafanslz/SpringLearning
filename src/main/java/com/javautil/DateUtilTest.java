package com.javautil;

import org.apache.commons.lang.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;

/**
 * <dl>
 * <dt>DateUtilTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class DateUtilTest {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        Date d = DateUtils.addDays(calendar.getTime(),1);
        System.out.println(calendar.getTime().getTime());
        System.out.println(d.getTime());

        /**
         * date
         * */
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = "2017-12-28 12:00:00";
        Date date = dateFormat.parse(str);
        System.out.println(date.getTime());

    }
}

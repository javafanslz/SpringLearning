package com.spring.timtask;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <dl>
 * <dt>TimeTaskTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/19</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TimeTaskTest {

    public void testMethod(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("ִ�п�ʼʱ��"+simpleDateFormat.format(new Date()));
    }
}

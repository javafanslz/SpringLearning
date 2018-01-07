package com.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <dl>
 * <dt>EventTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class EventTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmailEvent emailEvent = new EmailEvent("hello","2521510095@qq.com","发送");
        applicationContext.publishEvent(emailEvent);
    }
}

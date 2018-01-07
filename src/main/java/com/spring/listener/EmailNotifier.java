package com.spring.listener;

import com.spring.event.EmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * <dl>
 * <dt>EmailNotifier</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class EmailNotifier implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof EmailEvent){
            EmailEvent emailEvent = (EmailEvent) event;
            System.out.println("地址为"+emailEvent.getAdderss());
            System.out.println("内容为"+emailEvent.getText());
        }else{
            System.out.println("容器本身的事件"+event);
        }
    }
}

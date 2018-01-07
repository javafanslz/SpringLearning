package com.spring.listener;

import com.spring.event.EmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * <dl>
 * <dt>EmailNotifier</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class EmailNotifier implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof EmailEvent){
            EmailEvent emailEvent = (EmailEvent) event;
            System.out.println("��ַΪ"+emailEvent.getAdderss());
            System.out.println("����Ϊ"+emailEvent.getText());
        }else{
            System.out.println("����������¼�"+event);
        }
    }
}

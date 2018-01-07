package com.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * <dl>
 * <dt>EmailEvent</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/21</dd>
 * </dl>
 *
 * @author lizhu
 */
public class EmailEvent extends ApplicationEvent {

    private String adderss;

    private String text;


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never <code>null</code>)
     */
    public EmailEvent(Object source) {
        super(source);
    }

    public EmailEvent(Object source,String address,String text){
        super(source);
        this.adderss = address;
        this.text = text;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

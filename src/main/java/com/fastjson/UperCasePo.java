package com.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * <dl>
 * <dt> UperCasePo</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/22</dd>
 * </dl>
 *
 * @author lizhu
 */
public class UperCasePo {
    private String Local_url;
    @JSONField(name="requestId")
    private String requestId;
    @JSONField(name="UserName")
    private String userName;

    @JSONField(name = "Local_url")
    public String getLocal_url() {
        return Local_url;
    }

    public void setLocal_url(String local_url) {
        Local_url = local_url;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static void main(String[] args){
        UperCasePo uperCasePo = new UperCasePo();
        uperCasePo.setLocal_url("1");
        uperCasePo.setRequestId("2");
        uperCasePo.setUserName("lizhu");

        System.out.println(JSON.toJSON(uperCasePo));
    }
}

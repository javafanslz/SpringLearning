package com.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <dl>
 * <dt>FastJsonPo</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/28</dd>
 * </dl>
 *
 * @author lizhu
 */
public class FastJsonPo {
    @JSONField(name = "userName")
    private String username;
    @JSONField(name = "age")
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

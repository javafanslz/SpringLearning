package com.mongodb;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <dl>
 * <dt>TestPo</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/27</dd>
 * </dl>
 *测试
 * @author lizhu
 */
public class TestPo {
    @JSONField(name="_id")
    private String id;
    @JSONField(name="name")
    private String name;
    @JSONField(name="age")
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestPo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

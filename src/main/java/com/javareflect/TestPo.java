package com.javareflect;

/**
 * <dl>
 * <dt>TestPo</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/18</dd>
 * </dl>
 *
 * @author lizhu
 */
public class TestPo {
    public String testName;
    private String testField;
    public TestPo(){
        System.out.println("�޲ι��췽��");
    }
    public TestPo(String testName,String testField){
        this.testField = testField;
        this.testName = testName;
    }
    public void testMethod(){
        System.out.println("���Է���");
    }
    public void setTestField(String testField){
        this.testField = testField;
    }
    public String getTestField(){
        return this.testField;
    }

}

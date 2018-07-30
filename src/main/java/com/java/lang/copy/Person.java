package com.java.lang.copy;

/**
 * <dl>
 * <dt> Person</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/7/30</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Person implements Cloneable{
    private String userName;
    private String password;
    private Integer age;
    private Address address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone(){
        Person person = null;
        try {
            person = (Person) super.clone();
            if(address!=null){
                person.address = (Address) address.clone();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}

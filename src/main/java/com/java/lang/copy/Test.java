package com.java.lang.copy;

import java.util.Date;

/**
 * <dl>
 * <dt> Test</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/7/30</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Test{
    public static void main(String[] args){
        Person person = new Person();
        person.setUserName("lizhu");
        person.setPassword("000000");
        person.setAge(20);
        Address address = new Address();
        address.setAddressName("BJ");
        address.setAddressNum("001");
        person.setAddress(address);
        Person person1 = (Person) person.clone();
        System.out.println(person1.getPassword());//00000
        System.out.println(person1.getUserName());//lizhu
        System.out.println(person1.getAddress().getAddressName());//BJ
        System.out.println(person1.getAddress().getAddressNum());//001
        System.out.println(person1.getAge());
        System.out.println(person == person1);//false
        person.getAddress().setAddressNum("002");
        person.setPassword("00001");
        person.setAge(100);
        System.out.println(person1.getAddress().getAddressNum());//001   --->深拷贝
        System.out.println(person1.getPassword());//000000
        System.out.println(person1.getAge());
    }
}

package com.spring;

import com.spring.beantest.impl.Chinese;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class BeanTest
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = beanFactory.getBean("chinese", Person.class);
        person.userAxe();
        Person conPerson = beanFactory.getBean("chieseConstruct",Person.class);
        conPerson.userAxe();
        System.out.println(beanFactory.getType("chieseConstruct").getName());

    }
}

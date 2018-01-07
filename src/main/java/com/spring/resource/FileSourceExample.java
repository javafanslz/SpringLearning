package com.spring.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * <dl>
 * <dt>FileSourceExample</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/19</dd>
 * </dl>
 * Resource的测试类
 *
 * @author lizhu
 */
public class FileSourceExample {
    public static void main(String[] args) throws IOException {
        Resource fileResource = new FileSystemResource("D:\\IdeaProjects\\retry\\test\\src\\main\\resource\\applicationContext.xml");
        Resource classPathResource = new ClassPathResource("applicationContext.xml");
        InputStream s1 = fileResource.getInputStream();
        InputStream s2= classPathResource.getInputStream();
        System.out.println(fileResource.getFilename());
        System.out.println(classPathResource.getFilename());

    }
}

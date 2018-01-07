package com.spring.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;

/**
 * <dl>
 * <dt>EncodedResourceExample</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class EncodedResourceExample {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("resource.txt");
        EncodedResource encodedResource = new EncodedResource(resource,"UTF-8");
        String content = FileCopyUtils.copyToString(encodedResource.getReader());
        System.out.println(content);
    }
}

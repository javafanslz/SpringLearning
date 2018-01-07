package com.spring.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * <dl>
 * <dt>PatternResolverTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/25</dd>
 * </dl>
 *资源加载器
 *
 * @author lizhu
 */
public class PatternResolverTest {

    public static void main(String[] args) throws IOException {
        /**ResourceLoader接口   getResource 和getClassLoader*/
        ResourceLoader resourceLoader;
        /**ResourceLoader的子接口 添加getResources方法  返回多个resource*/
        ResourcePatternResolver patternResolver;

        PathMatchingResourcePatternResolver path = new PathMatchingResourcePatternResolver();
        Resource[] resources = path.getResources("classpath:*.xml");
        for(Resource resource:resources){
            System.out.println(resource.getFilename());
            System.out.println(resource.getDescription());
        }

    }
}

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
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/25</dd>
 * </dl>
 *��Դ������
 *
 * @author lizhu
 */
public class PatternResolverTest {

    public static void main(String[] args) throws IOException {
        /**ResourceLoader�ӿ�   getResource ��getClassLoader*/
        ResourceLoader resourceLoader;
        /**ResourceLoader���ӽӿ� ���getResources����  ���ض��resource*/
        ResourcePatternResolver patternResolver;

        PathMatchingResourcePatternResolver path = new PathMatchingResourcePatternResolver();
        Resource[] resources = path.getResources("classpath:*.xml");
        for(Resource resource:resources){
            System.out.println(resource.getFilename());
            System.out.println(resource.getDescription());
        }

    }
}

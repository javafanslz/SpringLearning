package com.log.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;


/**
 * <dl>
 * <dt> LogTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/11</dd>
 * </dl>
 *
 * @author lizhu
 */
public class LogTest {
    static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {

        int i = 0;
        logger.info("{}",i);
        System.out.println(Arrays.asList(new String[]{"1"}).contains("1" ));
    }
}

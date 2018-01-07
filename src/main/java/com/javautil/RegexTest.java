package com.javautil;

import com.mongodb.client.model.geojson.GeoJsonObjectType;

import java.util.regex.Pattern;

/**
 * <dl>
 * <dt>RegexTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/19</dd>
 * </dl>
 *
 * @author lizhu
 */
public class RegexTest {
    public static void main(String[] args) {
        boolean b = Pattern.matches("^(0|[1-9][0-9]*|-[1-9][0-9]*)$","2a00");

        String str = "111";


        System.out.println(b);

    }
}

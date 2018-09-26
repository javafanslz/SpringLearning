package com.java.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * <dl>
 * <dt> OutPutStreamTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/6/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class OutPutStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream out = new FileOutputStream(new File("F:\\a.txt"));
        try {
            out.write(38);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String,String> map = new HashMap<String,String>();
        System.out.println(map.get(null));
        File file = new File("out/aa.txt");
        if(!file.exists()){
            file.mkdirs();
        }

    }
}

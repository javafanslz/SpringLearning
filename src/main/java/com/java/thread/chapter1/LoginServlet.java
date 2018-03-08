package com.java.thread.chapter1;

import sun.rmi.runtime.Log;

/**
 * <dl>
 * <dt> LoginServlet</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/1</dd>
 * </dl>
 *
 * @author lizhu
 */
public class LoginServlet {
    private static String user;
    private static String pass;

    public static void doPost(String userName,String password){
       user = userName;
        try {
            Thread.sleep(3000);
            pass = password;
            System.out.println("userName = "+user+"Password"+pass);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

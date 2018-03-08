package com.java.thread.chapter1;

/**
 * <dl>
 * <dt> AliveRun</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/3/1</dd>
 * </dl>
 *
 * @author lizhu
 */
public class AliveRun {
    public static void main(String[] args){
        Thread thread = new Thread(new CountOperate());
        thread.start();
    }
}

package com.java.lang.exception;

/**
 * <dl>
 * <dt>ExceptionTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ExceptionTest {
    public static void testException(String param){
        try{
            int a = Integer.parseInt(param);
        }catch(Exception e){
            throw new BaseException("ɾ��ʧ��",e);
        }
    }

    public static void main(String[] args){
        try{
            testException("sdfsdf");
        }catch (BaseException b){
            System.out.println("ʧ��");
        }
    }
}

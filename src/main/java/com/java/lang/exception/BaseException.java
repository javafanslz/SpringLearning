package com.java.lang.exception;

/**
 * <dl>
 * <dt>BaseException</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/25</dd>
 * </dl>
 *
 * @author lizhu
 */
public class BaseException extends RuntimeException {
    public BaseException(){
        super();
    }

    public BaseException(String message,Throwable cause){
        super(message,cause);
    }
}

package com.java.lang.copy;

/**
 * <dl>
 * <dt> Adress</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/7/30</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Address implements Cloneable{
    private String addressNum;
    private String addressName;

    public String getAddressNum() {
        return addressNum;
    }

    public void setAddressNum(String addressNum) {
        this.addressNum = addressNum;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public Object clone(){
        Address address = null;

        try {
             address = (Address)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }
}

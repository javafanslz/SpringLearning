package com.javautil.observe;

/**
 * <dl>
 * <dt>ConcreteData</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/22</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ConcreteData {

    private float temp;
    private float pres;
    private float wet;

    public ConcreteData(float temp,float pres,float wet){
        this.temp = temp;
        this.pres = pres;
        this.wet = wet;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPres() {
        return pres;
    }

    public void setPres(float pres) {
        this.pres = pres;
    }

    public float getWet() {
        return wet;
    }

    public void setWet(float wet) {
        this.wet = wet;
    }
}

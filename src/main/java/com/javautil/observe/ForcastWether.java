package com.javautil.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * <dl>
 * <dt>ForcastWether</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: ��ţ���������������޹�˾</dd>
 * <dd>CreateDate: 2017/12/22</dd>
 * </dl>
 *
 * @author lizhu
 */
public class ForcastWether implements Observer {

    public void update(Observable o, Object arg) {
        WetherData wetherData = (WetherData)o;

    }
}

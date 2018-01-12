package com.java.enumpackage;

/**
 * <dl>
 * <dt> SwitchTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/12</dd>
 * </dl>
 *
 * @author lizhu
 */
public class SwitchTest {
    EnumWithSwitch enumWithSwitch = EnumWithSwitch.RED;

    /**
     *
     */
    public void change(){
        switch (enumWithSwitch){
            case RED : enumWithSwitch = EnumWithSwitch.YELLOW;
                        break;
            case YELLOW : enumWithSwitch = EnumWithSwitch.RED;
                        break;
          /*  default:
                System.out.println("error");*/
        }
    }
    @Override
    public String toString(){
        return enumWithSwitch+"";
    }
    public static void main(String[] args){
        SwitchTest switchTest = new SwitchTest();
        for(int i=0;i<7;i++){
            System.out.println(switchTest.toString());
            switchTest.change();
        }
    }
}

package com.java.enumpackage;
import static com.java.enumpackage.EnumClass.*;

/**
 * <dl>
 * <dt> EnumTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/1/12</dd>
 * </dl>
 *
 * @author lizhu
 */
public class EnumTest {

    EnumClass enumClass;
    public EnumTest(EnumClass enumClass){
        this.enumClass = enumClass;
    }
    public String toString(EnumClass enumClass){
        return "CONTEXT"+enumClass.toString();
    }
    public static void main(String[] args) {
        EnumClass enumClass = EnumClass.FIAMING;
        System.out.println(enumClass);
        //编译器会自动加一下有用的特性 toString() ordinal()用来显示enum常量的声明顺序 static values()声明
        //按照enum常量的声明顺序 产生由这些常量值构成的数组
        for(EnumClass s:EnumClass.values()){
            System.out.println(s+"ordinal"+s.ordinal());
        }
        System.out.println(new EnumTest(FIAMING));
     }
}

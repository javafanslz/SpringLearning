package com.fourteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <dl>
 * <dt> Shapes</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/2/2</dd>
 * </dl>
 *
 * @author lizhu
 */
public class Shapes {
    public static void main(String[] args){
        /**
         * RTTI  在运行的时候进行检查
         */
        List<Shape> list = Arrays.asList(new Triangle(),new Circle());
        for(Shape s :list){
            s.draw();
        }
    }
}

package com.adc.da.elk;


import com.adc.da.util.utils.FileUtil;
import com.itextpdf.text.log.SysoCounter;

import java.io.File;

/**
 * @program: stwl_claim
 * @description: 组件测试文件夹
 * @author: elk_wangchengxin
 * @create: 2018-11-22 14:56
 * @version: 2.0.0
 **/
public class elkDukeDemo {

    /**
     *
     * @param args
     */
    public static void main(String[] args){

        File f = new File("e:/eee");
        f.mkdir();
        System.out.println("运行完毕！");

    }
}


package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.atguigu.yygh.common.utils.MD5;
import com.atguigu.yygh.model.acl.User;
import com.atguigu.yygh.model.hosp.HospitalSet;

import java.util.Random;

public class TestRead {

    public static void main(String[] args) {
//        // 读取文件路径
//        String fileName = "F:\\excel\\01.xlsx";
//        //调用方法实现读取操作
//        EasyExcel.read(fileName, UserData.class,new ExcelListener()).sheet().doRead();
        Random random = new Random();
        HospitalSet hospitalSet = new HospitalSet();
        int i = random.nextInt(1000);
        hospitalSet.setSignKey(MD5.encrypt(System.currentTimeMillis()+""+random.nextInt(1000)));
        System.out.println();
    }
}

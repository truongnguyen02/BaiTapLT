/*
* creted date: 10 thg 10, 2021
* author: nvt
*/
package com.truongnv2008110260.BaiTapTuan5;

public class Car {

        String tenChuXe,hangSanXuat,dong;
        Boolean giayPhep;
        float dungTichXang;
        void car(String t , String h , String d ,Boolean g,float dtx){
            tenChuXe = t;
            hangSanXuat = h;
            dong = d;
            giayPhep = g;
            dungTichXang = dtx;
        }
        void inThongTinXe(){
            System.out.println("Tên chủ xe : " + tenChuXe);
            System.out.println("Hảng sản xuất : " + hangSanXuat);
            System.out.println("Dòng xe : " + dong);
            System.out.println("Giấy phép : " + giayPhep);
            System.out.println("dung tích xăng : " + dungTichXang);
            
        }
    
}
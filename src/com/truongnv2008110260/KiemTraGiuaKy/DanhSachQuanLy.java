package com.truongnv2008110260.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLi {
    private ArrayList<Nguoi> danhSach = new ArrayList<Nguoi>();
    public void them(Nguoi nguoi){
        this.danhSach.add(nguoi);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }
}
package com.truongnv2008110260.kiemtragiuaky;

public class Nguoi {
    private String hoTen;
    private String diaChi;
  
    public Nguoi(){
        System.out.println("Chương trình quản lí");
    }

    public Nguoi(String h){
        this.hoTen = h;
    }
    public Nguoi(String h, String d){
        this.hoTen = h;
        this.diaChi = d;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public String toString() {
        return "Nguoi [Địa Chỉ=" + diaChi + ", Họ Tên=" + hoTen + "]";
    }

    
}
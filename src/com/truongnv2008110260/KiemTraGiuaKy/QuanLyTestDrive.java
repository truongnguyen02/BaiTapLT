package com.truongnv2008110260.kiemtragiuaky;

public class QuanLiTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLi ds = new DanhSachQuanLi();
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc2(6);
        sv.setHoTen("Nguyễn A");
        sv.setDiaChi("123/234");
        sv.setSoLuongHV(20);
        ds.them(sv);
        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        nv.setHoTen("Nguyễn a");
        nv.setDiaChi("345/567");
        ds.them(nv);
        KhachHang kh = new KhachHang();
        kh.setTenCongTy("TNHH");
        kh.setTriGiaDonHang(140000);
        kh.setHoTen("Nguyễn B");
        kh.setDiaChi("567/789");
        ds.them(kh);
        ds.inDanhSach();



    }
}
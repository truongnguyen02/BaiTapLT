package com.truongnv2008110260.baitaplap3;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên : " );
        String hoten = sc.nextLine();
        System.out.println("Nhập điểm :  ");
        Double diem = sc.nextDouble();
        if (diem<9){
           System.out.println("Học lực xuất sắc");
        }if(7.5 <= diem){
            System.out.println("Học Lực Giỏi ");
        }else if( diem <= 8 ){
            System.out.println("Học lực Giỏi ");
        }if (diem < 7.5 ) {
            System.out.print("Học Lực Khá ");
        }else if ( diem >= 6.5  ){
            System.out.print("Học lực Khá ");
        }if (diem<6.5){
            System.out.println("Học lực Trung Bình ");
        }else if (diem >= 5){
            System.out.println("Học lực Trung Bình");
        }if (diem <5 ){
            System.out.print("Học Lực Yếu");
        }
        System.out.printf("%s: %1f điểm ", hoten,diem);

    }
    
}
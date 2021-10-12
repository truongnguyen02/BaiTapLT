package com.truongnv2008110260.baitaplap1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhập vào họ tên học sinh");
    String hoten = sc.nextLine();
    System.out.println("Điểm trung bình : ");
    Double diem = sc.nextDouble();
    System.out.printf("%s: %1f điểm ", hoten,diem);
    }
}
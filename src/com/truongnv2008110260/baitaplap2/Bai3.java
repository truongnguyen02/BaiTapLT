package com.truongnv2008110260.baitaplap2;
import java.util.Scanner;
public class bai3 {
     public static void main(String[] args) {

         double  soDien;
         Scanner sc = new Scanner(System.in);
         System.out.println("Hãy Nhập Số Điện Klw ;");
         soDien=sc .nextDouble();
         if(soDien<50){
             System.out.println("Tổng số tiền là : "+soDien*1000);
         }
         else{
             System.out.println("Tổng số tiền là : "+50*1000+(soDien-50)*1200);

         }
     }
        
}
    

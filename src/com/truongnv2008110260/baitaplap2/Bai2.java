package com.truongnv2008110260.baitaplap2;
import java.util.Scanner;
public class bai2 {
     public static void main(String[] args) {
         double a,b,c,x1,x2,delta;
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập hệ số a : ");
         a=sc.nextDouble();
         System.out.println("Nhập hệ số b : ");
         b=sc.nextDouble();
         System.out.println("Nhập hệ số c : ");
         c=sc.nextDouble();
         delta = Math.pow(b,2)-4*a*c;
         if(delta<0)
         {
             System.out.println("Phương Trình vô nghiệm");
         }
         else if(delta == 0)
         {
             x1 = -b/(2*a);
             System.out.println("Phương trình có 1 nghiệm là x="+x1);
         }else {
             x1 = (-b + Math.sqrt(delta))/(2 * a);
             x2 = (-b - Math.sqrt(delta))/(2 * a);
             System.out.println("Phương trình có 2 nghiệm là x1 = "+x1 + " và x2 = "+x2);
         }


        
    }
    
}
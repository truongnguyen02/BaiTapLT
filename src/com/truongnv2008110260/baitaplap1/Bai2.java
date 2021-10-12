package com.truongnv2008110260.baitaplap1;
import java.util.Scanner;
public class bai2{

        public static void main(String[] args){
            HCN hcn=new HCN();
            hcn.nhapDL();
            hcn.chuvi();
            hcn.dientich();
            hcn.canhnhonhat();
            System.out.println("Chu vi: " + hcn.chuvi());
            System.out.println("Dien tich: " + hcn.dientich());
            System.out.println("Canh Nho Nhat la: " + hcn.canhnhonhat());
       }
    
   }
   class HCN
   {
      int cd, cr, cv, dt,cnn;
      public void nhapDL()
      {
          Scanner nhap=new Scanner(System.in);
           System.out.println("Nhap chieu dai:");
           cd=nhap.nextInt();
           System.out.println("Nhap chieu rong:");
           cr=nhap.nextInt();
        
      }
      public int dientich()
      {
          dt = cd * cr ;
          return dt;
      }
      public int chuvi()
      {
         cv= (cd + cr)*2;
         return cv;
      }
      public int canhnhonhat()
      {
          cnn = Math.min(cd,cr);
          return cnn;
      }
       
   }

    
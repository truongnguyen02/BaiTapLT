package com.truongnv2008110260.baitaplap1;
import java.util.Scanner;
public class bai3 {
     public static void main(String[] args) {
         HLP hlp = new HLP();
         hlp.nhapDL();
         hlp.thetich();
         System.out.println("Thể Tích Hình Lập Phương là: "+hlp.thetich());
        }
}
class HLP
{
   int  canh,tt;
   public void nhapDL()
   {
       Scanner nhap = new Scanner(System.in);
       System.out.println("nhap vao chieu dai canh");
       canh=nhap.nextInt();

   }
   public int thetich()
   {
       tt= canh * canh * canh;
       return tt;
   }   


}


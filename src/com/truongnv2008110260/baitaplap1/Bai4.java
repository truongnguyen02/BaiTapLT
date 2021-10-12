package com.truongnv2008110260.baitaplap1;
import java.util.Scanner;


public class bai4 {
 

public static void main(String[] args) {
     Delta dt = new Delta();
     dt.nhapDl();
     dt.tinhdelta();
     dt.candelta();
     System.out.println("Tính Delta: "+ dt.tinhdelta());
     System.out.println("Tính căn Delta: "+dt.candelta());
    } 
}
class Delta
{
    int a,b,c,tdt;
    float tcdt;
    public void nhapDl()
    {
       Scanner  nhap = new Scanner(System.in);
       System.out.println("Nhập a ");
       a=nhap.nextInt();
       System.out.println("Nhập b ");
       b=nhap.nextInt();
       System.out.println("Nhập c ");
       c=nhap.nextInt();
    }
    public int tinhdelta()
    {
        tdt =  (int) (Math.pow(b,2) - 4 * a * c);
        return tdt;
    }
    public float candelta()
    {
        tcdt =(float) (Math.sqrt(tdt));
        return tcdt;
    }
}

    
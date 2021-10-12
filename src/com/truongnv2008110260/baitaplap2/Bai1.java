package com.truongnv2008110260.baitaplap2;
import java.util.Scanner;

    public class bai1 {
        public static void main(String[] args) {
            int a;
            int b;
            a=NhapSonguyen("Nhập hệ số a: ");
            b=NhapSonguyen("Nhập hệ số b: ");
            GiaiPhuongTrinhBac1(a,b);
        }
public static int NhapSonguyen(String str){
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.println(str);
    x=sc.nextInt();
    return x;
}
public static void GiaiPhuongTrinhBac1(int a,int b)
{
    if (a==0){
        if(b==0)
           System.out.println("Phương Trình Vô Số Ngiệm");
        else
            System.out.println("Phương Trình Vô Nghiệm");
        }
    else
    System.out.println("Phương Trình có nghiệm là x= : "+(-b/a));
}

}

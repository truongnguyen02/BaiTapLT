package com.truongnv2008110260.baitaplap2;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        System.out.println("==========MENU==========");
        System.out.println("1.Giải Phương Trình Bậc 1 ");
        System.out.println("2.Giải Phương Trình Bậc 2 ");
        System.out.println("3.Tính Tiền Điện");
        System.out.println("========END MENU========");
        System.out.println("Hãy chọn một chức năng");
        Scanner bienNhap= new Scanner(System.in);
        int giaTriNhap = bienNhap.nextInt();
        switch(giaTriNhap){
            case 1 :giaiPTBac1();;break;
            case 2 :giaiPTBac2();;break;
            case 3 :TinhTienDien();;break;
            default: System.out.println("Hãy chọn chức năng khác");
        }

        
    }
    static void giaiPTBac1(){
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
static void giaiPTBac2(){
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
 static void TinhTienDien(){
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
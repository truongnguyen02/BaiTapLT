package com.truongnv2008110260.baitaplap3;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int N ;
        Scanner sc = new Scanner(System.in);
        N=Nhapsonguyento("Hãy nhập số N : ");
        Kiemtrasonguyento(N);
        if(Kiemtrasonguyento(N)){
            System.out.println(N+" là số nguyên tố");
        }else {
            System.out.print(N+" không phải là số nguyên tố");
        }
        sc.close();
       
    }
    public static int Nhapsonguyento(String str){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x=sc.nextInt();
        return x; 

    }
    public static boolean Kiemtrasonguyento(int N){
        boolean ok = true;
        for (int i=2;i<N-1;i++){
            if(N % i==0){
                ok = false;
                break;
            }
            i++;
            }
        return ok;
        }
    }

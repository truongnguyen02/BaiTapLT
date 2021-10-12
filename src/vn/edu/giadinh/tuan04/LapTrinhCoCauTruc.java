package vn.edu.giadinh.tuan04;
import java.util.Scanner;
public class LapTrinhCoCauTruc {
    public static void main(String[] args) {
        int account_number = 2008110255;
        int account_balance = 100000;
        
         account_balance = account_balance + 100000;
        showData(account_number,account_balance);
        account_balance = account_balance - 50000;
        showData(account_number,account_balance);
        account_balance = account_balance - 10000;
        showData(account_number,account_balance);
    }
    public static void showData(int account_number,int account_balance){
        System.out.printf("\nAccount Number = %d",account_number);
        System.out.printf("\nAccount Balance = %d",account_balance);

    }

    public void soTienrut(){

    }
    
}

package vn.edu.giadinh.tuan04;

public class LapTrinhKCauTruc {
    public static void main(String[] args) {
        int account_number = 2008110255;
        int account_balance = 100000;
        account_balance = account_balance + 100000;
        System.out.printf("Account Number = %d",account_number);
        System.out.printf("\nAccount Balance = %d",account_balance);
        account_balance=account_balance-50000;
        System.out.printf("\nAccount Number = %d",account_number);
        System.out.printf("\nAccount Balance = %d",account_balance);
        account_balance=account_balance-10000;
        System.out.printf("\nAccount Number = %d",account_number);
        System.out.printf("\nAccount Balance = %d",account_balance);



    }
    public class Account{
        int account_balance;
        int account_number;
        public void  showData(int account_number,int account_balance){
            System.out.printf("\nAccount Number = %d",account_number);
            System.out.printf("\nAccount Balance = %d",account_balance);

    }
}
    
}

package com.truongnv2008110260.baitaplap4;

public class AccountTestDirve {
    public static void main(String[] args) {
        Account account;
    
        account= new Account(2008110255,500000);
        account.showData();
        account.deposit(500000);
        account.showData();
        account.withdraw(100000);
        account.showData();

        Customer customer;
        customer=new Customer();

        customer.getName();
        customer.getAddress();

        Employee employee;
        employee = new Employee();
        employee.getName();
        employee.getSalary();
    }
         
    }
    

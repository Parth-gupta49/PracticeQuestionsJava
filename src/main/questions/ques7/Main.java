package main.questions.ques7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1001,"Parth Gupta",1000f,"Savings");
        Account account2 = new Account(1002,"Abhi Gupta",2000f,"Current");
        Account account3 = new Account(1003,"Steve Gupta",3000f,"Savings");
        Account account4 = new Account(1004,"Smith Gupta",4000f,"RD-Account");
        Account account5 = new Account(1005,"Maxi",4000f,"RD-Account");
        Bank bank = new Bank();
        bank.add(account1);
        bank.add(account2);
        bank.add(account3);
        bank.add(account4);
        ArrayList <Account> accounts = bank.returnAccounts();
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
        bank.addMoney(account4,50000);
        bank.removeMoney(account2,3000);
        bank.removeMoney(account2,2000);

        bank.removeMoney(account5,2000);
        bank.addMoney(account5,2000);
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}

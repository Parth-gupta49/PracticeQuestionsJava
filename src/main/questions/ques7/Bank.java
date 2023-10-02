package main.questions.ques7;

import java.util.ArrayList;

//import static main.questions.ques7.Account.displayAccountDetails;

/*7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.*/
public class Bank {

    private final ArrayList<Account> listOfAccounts;

    public Bank() {
        listOfAccounts = new ArrayList<>();
    }

    public void add(Account account){
        listOfAccounts.add(account);
    }
    public void remove(Account account){
        listOfAccounts.remove(account);
    }
    public void addMoney(Account account,long deposit){
        int check = 0;
        for (Account acc : listOfAccounts) {
            if (acc.getAccountNo() == account.getAccountNo()) {
                check = 1;
                break;
            }
        }
        if (check==1)
            account.deposit(deposit);
        else
            System.out.println("Account with account number : "+account.getAccountNo()+" - NOT FOUND");
    }
    public void removeMoney(Account account,long withdraw){
        int check = 0;
        for (Account acc : listOfAccounts) {
            if (acc.getAccountNo()==account.getAccountNo())
                if (acc.getAccountBalance()<withdraw)
                    check=2;
                else
                    check = 1;
        }
        if (check==1)
            account.withdraw(withdraw);
        else if (check == 0)
            System.out.println("Account with account number : "+account.getAccountNo()+" - NOT FOUND");
        else
            System.out.println("Balance is insufficient");
    }
    /*public void displayAllAccount(){
        for (Account account : listOfAccounts) {
            account.displayAccountDetails();
        }
    }*/
    public ArrayList<Account> returnAccounts(){
        return listOfAccounts;
    }
}

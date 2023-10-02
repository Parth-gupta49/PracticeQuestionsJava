package main.questions.ques7;
/*7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.*/
public class Account {
    private final long accountNo;
    private String accountHolderName;
    private float accountBalance;
    private String accountType;

    public Account(long accountNo, String accountHolderName, float accountBalance, String accountType) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void deposit(float accountBalance) {
        this.accountBalance += accountBalance;
    }
    public void withdraw(float accountBalance) {
        this.accountBalance -= accountBalance;
    }

    public long getAccountNo() {
        return accountNo;
    }
    public void displayAccountDetails(){
        System.out.println("AccountHolder Name : " + this.accountHolderName + "\nAccount Number : " + this.accountNo + "\nBalance : " + this.accountBalance + "\nAccount-Type : " + this.accountType);
    }
}

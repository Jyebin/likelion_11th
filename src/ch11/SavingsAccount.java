package ch11;

public class SavingsAccount extends BankAccount implements Withdrawable{
    boolean isOverdraft;

    void transfer(){};
    public void withdraw(){ //재정의
        System.out.println("Withdraw");
    }



}

package ch11;

public class BankAccount {
    //멤버변수
    private int bankCode;
    private int accountNo;
    private String owner;
    private int balance;
    private boolean inDormant; //휴먼계좌
    private int password;

    public BankAccount() {

    }
    //메소드
    public void inquiry(){}
    public void deposit(){}

    public void withdraw(){}

    public void heldInDormant(){}

    public void changePassword(int password)
    {
        this.password = password;
    }
    //생성자
    //클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치해야함
    //new 연산자와 함께 사용
    BankAccount(int bankCode, int accountNo, String owner, int balance, int password, boolean isDormant){
        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.inDormant = isDormant;
        this.password = password;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isInDormant() {
        return inDormant;
    }

    public void setInDormant(boolean inDormant) {
        this.inDormant = inDormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}

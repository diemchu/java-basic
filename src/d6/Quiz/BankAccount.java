package d6.Quiz;
//은행계좌 클래스 BankAccount를 만들고,
//적금계좌 클래스 SavingsAccount를 만들어보자.
//BankAccount 클래스는 현재 잔고, 비밀번호에 대한 정보를 가지고 있다.
//BankAccount 클래스는 돈을 입금, 출금할 수 있다.
//출금할때는 출금액과 비밀번호를 함께 제공해야 한다.
//SavingsAccount 클래스는 몇번째 입금 회차인지에 대한 정보, 만기 회차 정보, 매 회차 입금액에 대한 정보를 가지고 있다.
//SavingsAccount 클래스는 돈을 입금, 출금할 수 있다.
//입금할때는 회차 입금액과 동일한 금액이 입금되어야 한다.
//출금은 입금 회차가 만기 회차 보다 더 클때만 가능하다.
//출금할때는 출금액과 비밀번호를 함께 제공해야 한다.
import java.time.LocalDate;
public abstract  class BankAccount {
     private int balance;
     private String password;
    //      입금 함수
     public abstract int deposit(int money);
     // 출금
    public  abstract int withdraw(int money,String password);

    public BankAccount(int balance, String password) {
        this.balance = balance;
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public void setWithdraw(int money){
        this.balance -= money;
    }


    public int getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
class SavingsAccount extends BankAccount {
    private int depositRound;
    private LocalDate date;
    private int depositAmount;
    public SavingsAccount(int balance, String password, int depositRound , LocalDate date , int depositAmount) {
        super(balance, password);
        this.depositRound  = depositRound;
        this.date = date;
        this.depositAmount = depositAmount;
    }
    @Override
    public int deposit(int money) {
        if( depositRound <= 0 ||  depositAmount != money ) return  super.getBalance();
        else {
           super.setBalance(money);
           depositRound--;
        }
        return getBalance();
    }
    @Override
    public int withdraw(int money, String password) {
        if(  money < this.depositAmount || !password.equals(super.getPassword())) return super.getBalance() ;
        else{
            setWithdraw(money);
            return  super.getBalance();
        }
    }
    @Override
    public String toString() {
        return super.toString()+   "SavingsAccount{"  +
                "depositRound=" + depositRound +
                ", date=" + date +
                ", depositAmount=" + depositAmount +
                '}';
    }



    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(
                0,"1234",10 ,LocalDate.of(2025,4,10),
                100
        );
        System.out.println(account);
        for (int i = 0; i < 10 ; i++) {
            account.deposit(100);
        }
        System.out.println(account);
        account.withdraw(500,"1234");
        System.out.println(account);
    }
}

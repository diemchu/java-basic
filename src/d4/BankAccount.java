package d4;

//은행 계좌를 나타내는 BankAccount 클래스를 만들어보자.
//        계좌 번호, 잔고, 비밀번호에 대한 정보가 담겨있다.
//계좌 번호는 0~9 사이의 숫자로 이루어진 8자리 문자열이다.
//비밀번호는 0~9 사이의 숫자로 이루어진 4자리 문자열이다.
//입금을 나타내는 deposit 메서드를 가지고 있다.
//입금액을 인자로 받는다.
//이후 잔고를 정수로 반환한다.
//출금을 나타내는 withdraw 메서드를 가지고 있다.
//성공 여부를 boolean 데이터로 반환한다.
//출금액과 비밀번호를 인자로 받는다.
//비밀번호가 일치하지 않으면 실패한다.
//비밀번호의 일치 여부는 문자열 객체의 .equals()를 활용한다.
//계좌 잔고가 부족하면 실패한다.
//총 생성된 계좌의 숫자와, 전체 계좌들의 잔고 총합에 대한 정보를 가지고 있다.
//이 정보를 반환하는 메서드를 가지고 있다.


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class BankAccount
{
    private String bankNumber ;
    private String password;
    private int balance;
    private  static  int totalAccount = 0;
    private static int totalBalance = 0;

    public BankAccount(String bankNumber, String password,int balance) {
        this.bankNumber = bankNumber;
        this.password = password;
        this.balance = balance;
        totalAccount++;
        totalBalance += balance;
    }
    // 입금 함수
    public int deposit (int  depositAmount){
        totalBalance+=depositAmount;
        return  balance+=depositAmount;
    }

    //출금하수
    public boolean withdraw(int withdrawalAmount, @NotNull String password){
        if(password.equals(this.password)){
            if( withdrawalAmount > balance ){
                System.out.println("잔액 부족합니다!!!!");
                return  false;
            }else{
                balance-=withdrawalAmount;
                totalBalance-=withdrawalAmount;
                return true;
            }
        }else  return  false;
    }
    // 총 생성된 계좌의 숫자와, 전체 계좌들의 잔고 총합에 대한 정보
    public static String getInfoAllAccounts(){
        return  String.format("계좌 개수: %d , 전체 계좌들의 잔액: %d원",totalAccount,totalBalance);
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "bankNumber='" + bankNumber + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
    public String getBankNumber() {
        return bankNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

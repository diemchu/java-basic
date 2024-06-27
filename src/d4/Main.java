package d4;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("1233334","2332",1000);
        BankAccount user2 = new BankAccount("1233334","2332",2000);
        BankAccount user3 = new BankAccount("1233334","2332",3000);
        BankAccount user4 = new BankAccount("1233334","2332",4000);
        ArrayList<BankAccount> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        System.out.println(user1.deposit(100));
        System.out.println(user2.deposit(100));
        System.out.println(user3.deposit(100));
        System.out.println(user4.deposit(100));
        System.out.println(user4.withdraw(5000,"2332"));
        System.out.println(BankAccount.getInfoAllAccounts());
    }
}

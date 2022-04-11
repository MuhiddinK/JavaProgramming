package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Muti Kara", 123456789);

        System.out.println(account1);

        account1.deposit(60000);
        account1.checkBalance();

        account1.withdraw(18000);
        account1.checkBalance();


        System.out.println("----------------------------------------");


        BankAccount account2 = new BankAccount();

        account2.setInfo("Sevda Kara", 132456789);

        account2.deposit(30000);
        account2.checkBalance();

        account2.withdraw(4500);
        account2.checkBalance();


    }

}

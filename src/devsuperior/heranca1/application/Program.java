package devsuperior.heranca1.application;

import devsuperior.heranca1.entities.Account;
import devsuperior.heranca1.entities.BusinessAccount;
import devsuperior.heranca1.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


        // UPCASTING


        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;

        // BusinessAccount acc5 =  (BusinessAccount) acc3;
        if (acc3 instanceof  BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // Testes sobrescrição

        Account acc6 = new Account(1005, "Alex", 1000.0);
        acc6.withDraw(200.0);
        System.out.println("Saldo conta com taxa R$ " + acc6.getBalance());

        Account acc7 = new SavingsAccount(1006, "Maria", 1000.0, 0.01);
        acc7.withDraw(200.0);
        System.out.println("Saldo conta sem taxa R$ " + acc7.getBalance());

        Account acc8 = new BusinessAccount(1007, "Fabio", 1000.0, 500.0);
        acc8.withDraw(200.0);
        System.out.println("Saldo conta saque - taxa account - tava businessAccount R$ " + acc8.getBalance());

        // Exemplo polimorfismo

        Account x = new Account(1008, "Vascos", 1000.0);
        Account y = new SavingsAccount(1009, "Saulo", 1000.0, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println("Saldo conta x(taxa de saque R$5) R$ = " + x.getBalance());
        System.out.println("Saldo conta poupanca sem taxa R$ = " + y.getBalance());

    }
}

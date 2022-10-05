package Bank.applicattion;


import Bank.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holderAccount = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        if ( option == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(numberAccount,holderAccount,initialDeposit);
        }else {
            bank = new Bank(numberAccount, holderAccount);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println("Welcome Bank JavaMoney!!!!");
        System.out.print(" 1 - Deposit / 2 - WithDraw / 3 - Exit = ");
        int transaction = sc.nextInt();

        while (transaction != 3){

            if ( transaction == 1){
                System.out.println();
                System.out.print("Enter a deposit valeu: ");
                double depositValue = sc.nextDouble();
                bank.deposit(depositValue);
                System.out.println();
                System.out.println("Update account data: ");
                System.out.println(bank);
            } else if(transaction == 2){
                System.out.println();
                System.out.print("Enter a withdraw valeu: ");
                double withdrawValeu = sc.nextDouble();
                bank.withDraw(withdrawValeu);
                System.out.println("Update account data: ");
                System.out.println(bank);
            }

            System.out.print(" 1 - Deposit / 2 - WithDraw / 3 - Exit = ");
            transaction = sc.nextInt();
        }

        System.out.println();
        System.out.println("Thanks! Check back often.");
        sc.close();
    }
}

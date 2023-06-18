package application;

import model_entities.Account;
import model_exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DomainException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit:");
        double withdrawLimit = sc.nextDouble();
        Account acc = new Account(number, name, balance, withdrawLimit);


        System.out.println();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f", acc.getBalance());
        }


        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }





        sc.close();


    }
}
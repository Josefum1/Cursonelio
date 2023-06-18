package application;

import entities.Enterprise;
import entities.Individual;
import entities.taxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<taxPayer> list = new ArrayList<>();

        System.out.print("Enter number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenses: ");
                double healthExpenses = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenses));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new Enterprise(name, annualIncome, numberEmployees));
            }
        }

        double sum = 0.0;

        System.out.println();
        System.out.println("TAXES PAID: ");

        for (taxPayer payer : list) {
            double tax = payer.tax();
            System.out.println(payer.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));


        sc.close();

    }
}
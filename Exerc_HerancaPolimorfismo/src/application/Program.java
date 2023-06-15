package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                list.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS");
        for(Product prod : list) {
            System.out.println(prod.priceTag());
        }

















        sc.close();
}
}

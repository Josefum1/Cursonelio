package exercicios_estrutura_sequencial;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double salary, totalSalary;
		
		System.out.println("insert the employee number: ");
		number = sc.nextInt();
		System.out.println("insert the total work hours: ");
		hours = sc.nextInt();
		System.out.println("insert the pay rate: ");
		salary = sc.nextDouble();
		
		totalSalary = hours * salary;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$%.2f " , totalSalary);
		
		
		
		
		
		
		
		sc.close();

	}

}

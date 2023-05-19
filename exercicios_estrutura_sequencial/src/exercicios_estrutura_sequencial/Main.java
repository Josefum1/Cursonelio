package exercicios_estrutura_sequencial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//exercício 1
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("insira o valor de x: ");
		x = sc.nextInt();
		System.out.println("Insira o valor de y: ");
		y = sc.nextInt();
		
		System.out.println("O resultado de x + y é: " + (x+y));
		
		sc.close();
		

	}

}

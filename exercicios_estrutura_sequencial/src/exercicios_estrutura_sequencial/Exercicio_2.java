package exercicios_estrutura_sequencial;
import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi;
		double raio;
		double area;
		
		pi = 3.14159;
		System.out.println("Insira o valor do raio: ");
		raio = sc.nextDouble();
		area = pi * raio * raio;
		
		
		System.out.printf("O valor da área do círculo é: %.4f" , area);
	
		
		
		sc.close();	

	}

}

package entities;

public class Employee {

	private int id;
	private String nome;
	private double salario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void increaseSalario(double porcentagem) {
		salario =+ salario * porcentagem/ 100.0;
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	
}

package br.com.viniciusoliveira.prova;

public class Funcionario extends Pessoa {

	//Atributos
	private int matricula;
	private double salario;
	private double primeiraParcela = 60.0;
	private double segundaParcela = 40.0;
	
	//Construtores
	public Funcionario(int matricula, double salario, String nome, String sobrenome) {
		super(nome, sobrenome);
		this.matricula = matricula;
		//Caso seja inserido um salário negativo será colocado um salário mínimo
		if (salario > 0) {
			this.salario = salario;
		}else {
			this.salario = 1039;
		}	
	 }
	
	//Metodos
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		}else {
			this.salario = 1039;
		}	
	}
	
	public double getSalarioPrimeiraParcela() {
		return (primeiraParcela/100.0)*getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return (segundaParcela/100.0)*getSalario();
	}
	
}

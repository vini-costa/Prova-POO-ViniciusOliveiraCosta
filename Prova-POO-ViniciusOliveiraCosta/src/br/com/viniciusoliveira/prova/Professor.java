package br.com.viniciusoliveira.prova;

public class Professor extends Funcionario {
	
	public Professor(int matricula, double salario, String nome, String sobrenome) {
		super(matricula, salario, nome, sobrenome);
	}
	
	
	@Override
	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}
	
	@Override
	public double getSalarioSegundaParcela() {
		return 0;
	}
	
}

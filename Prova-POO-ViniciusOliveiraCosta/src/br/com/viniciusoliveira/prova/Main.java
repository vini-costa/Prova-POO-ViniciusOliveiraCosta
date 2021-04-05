package br.com.viniciusoliveira.prova;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Tiago", "Silva");
		Funcionario funcionario = new Funcionario(1991,1500.00,"Maria","Oliveira");
		Professor professor = new Professor(1987, 2500.0, "Andre", "Souza");
	
		System.out.println("======Pessoa======");
		System.out.println("Classe: " + pessoa.getClass());
		System.out.println("Nome completo: " + pessoa.toString());
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Sobrenome: " + pessoa.getSobrenome());
		System.out.println();
		
		System.out.println("======Funcionario======");
		System.out.println("Classe: " + funcionario.getClass());
		System.out.println("Nome completo: " + funcionario.toString());
		System.out.println("Matr�cula: " + funcionario.getMatricula());
		System.out.println("Sal�rio: " + funcionario.getSalario());
		System.out.println("Primeira parcela do sal�rio: " + funcionario.getSalarioPrimeiraParcela());
		System.out.println("Segunda parcela do sal�rio: " + funcionario.getSalarioSegundaParcela());
		System.out.println();
		
		System.out.println("======Professor======");
		System.out.println("Classe: " + professor.getClass());
		System.out.println("Nome completo: " + professor.toString());
		System.out.println("Matr�cula: " + professor.getMatricula());
		System.out.println("Sal�rio: " + professor.getSalario());
		System.out.println("Primeira parcela do sal�rio: " + professor.getSalarioPrimeiraParcela());
		System.out.println("Segunda parcela do sal�rio: " + professor.getSalarioSegundaParcela());
		System.out.println();
		
		//Utilizando o construtor sem par�metros
		System.out.println("======PessoaDois======");
		Pessoa pessoaDois = new Pessoa();
		pessoaDois.setNome("Carla");
		pessoaDois.setSobrenome("Ferreira");
		System.out.println("Classe: " + pessoa.getClass());
		System.out.println("Nome completo: " + pessoaDois.toString());
		
		
	}

}

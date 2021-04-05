package br.com.viniciusoliveira.prova;

public class Pessoa {

	//atributos
	private String nome;
	private String sobrenome;

	
	//Construtores
	Pessoa(){
		
	}
	
	Pessoa(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	//metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String toString() {
		String nomeCompleto = this.nome + " " + this.sobrenome;
		return nomeCompleto;
	}
	
	public String getNomeCompleto() {
		return toString(); 
	}
		
}

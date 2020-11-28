package br.com.samarni.model;

public class Usuario {//atributos da classe
	private int codigo;
	private String nome;
	private String cpf; 		//Utilizado CPF par diferenciar o usuario caso tenha pessoas com o mesmo nome	
	private String login;
	private String senha;
	private String observacao;

	public Usuario(String nome, String cpf, String login, String senha, String observacao) {//Construtor da classe
		//this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.observacao = observacao;
	}
	//Getters
	public int getCodigo() {
		return this.codigo;	
	}
	public String getNome() {
		return this.nome;	
	}
	public String getCPF() {
		return this.cpf;	
	}
	public String getLogin() {
		return this.login;	
	}
	public String getSenha() {
		return this.senha;	
	}
	public String getObservacao() {
		return this.observacao;	
	}
	//Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
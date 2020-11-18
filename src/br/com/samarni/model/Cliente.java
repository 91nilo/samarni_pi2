package br.com.samarni.model;

public class Cliente {
	private String cpf;
	private String nome;
	private String endereco;
	private String cidade;
	private String uf;
	private String telefone;
	private String observacao;
	//private int codigo;
	//Construtor
	public Cliente(String cpf, String nome, String endereco, String cidade, String uf, 
			String telefone, String observacao){
	
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		//this.codigo = codigo;
	}
	
	//Construtor Simples
	public Cliente(){
		
	}
	
	//Getters
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public String getEndereco () {
		return this.endereco;
	}
	
	public String getCidade () {
		return this.cidade;
	}
	
	public String getUf () {
		return this.uf;
	}
	
	public String getTelefone () {
		return this.telefone;
	}
	
	public String getObservacao () {
		return this.observacao;
	}
	
	//Setters
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	public void setUf (String uf) {
		this.uf = uf;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public void setObservacao (String observacao) {
		this.observacao = observacao;
	} 
}

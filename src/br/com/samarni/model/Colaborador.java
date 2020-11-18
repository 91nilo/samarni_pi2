package br.com.samarni.model;
//Classe Colaborador com encapsulamento, construtor, getters e setters
public class Colaborador {
	private int codigo;
	private String nome;
	private String funcao;
	private String cpf;
	private String telefone;
	
  //Construtor
	public Colaborador(int codigo, String nome, String funcao, String cpf, String telefone) {
		this.nome = nome;
		this.funcao = funcao;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	//Getters
	public int getCodigo() {
		return this.codigo;	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getFuncao() {
		return this.funcao;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	//Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setFuncao (String funcao) {
		this.funcao = funcao;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
}
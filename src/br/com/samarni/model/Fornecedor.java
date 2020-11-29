package br.com.samarni.model;

public class Fornecedor {
	/* cod_for smallint auto_increment PRIMARY KEY,
	 cnpj_for varchar(14),
	 nome_for varchar(30) NOT NULL ,
	 endereco_for varchar(50),
	 cidade_for varchar(30),
	 uf_for varchar(2),
	 fone_for varchar(15),
	 observacao_for varchar(60) */
	
	private short codigo;
	private String cnpj;
	private String nome;
	private String endereco;
	private String cidade;
	private String uf;
	private String fone;
	private String observacao;
	
	
	
	
	public Fornecedor(String cnpj, String nome, String endereco, String cidade, String uf, String fone, String observacao) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
		this.fone = fone;
		this.observacao = observacao;
	}
	
	public Fornecedor() {
		
	}
	
	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}

package br.com.samarni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.samarni.factory.ConnectionFactory;
import br.com.samarni.model.Fornecedor;

public class FornecedorDAO {
	//classe responsável pelo CRUD

	

	public void salvar(Fornecedor fornecedor) {
		String insertUsuario = "INSERT INTO FORNECEDOR (cnpj_for, nome_for, endereco_for, cidade_for, "
				+ "uf_for, fone_for, observacao_for)"
				+ "	VALUES (?, ?, ?, ?, ?, ?, ?);";

		Connection conn = null;

		PreparedStatement pstm = null;

		//Tentando conectar ao banco

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement)conn.prepareStatement(insertUsuario);	

			pstm.setString(1, fornecedor.getCnpj());
			pstm.setString(2, fornecedor.getNome());
			pstm.setString(3, fornecedor.getEndereco());
			pstm.setString(4, fornecedor.getCidade());
			pstm.setString(5, fornecedor.getUf());
			pstm.setString(6, fornecedor.getFone());
			pstm.setString(7, fornecedor.getObservacao());
			
			
			pstm.execute();

			System.out.println("Fornecedor cadastrado.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}

				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	//Fazendo consulta (READ)
	public static List<Fornecedor> getFornecedor(){

		String read = "SELECT * FROM FORNECEDOR;";

		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

		Connection conn = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement)conn.prepareStatement(read);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Fornecedor fornecedor = new Fornecedor(read, read, read, read, read, read, read);
				fornecedor.setCnpj(rset.getString("cnpj_for"));
				fornecedor.setNome(rset.getString("nome_for"));
				fornecedor.setEndereco(rset.getString("endereco_for"));
				fornecedor.setCidade(rset.getString("cidade_for"));
				fornecedor.setUf(rset.getString("uf_for"));
				fornecedor.setFone(rset.getString("fone_for"));
				fornecedor.setObservacao(rset.getString("observacao_for"));
				
				/* cod_for smallint auto_increment PRIMARY KEY,
				 cnpj_for varchar(14),
				 nome_for varchar(30) NOT NULL ,
				 endereco_for varchar(50),
				 cidade_for varchar(30),
				 uf_for varchar(2),
				 fone_for varchar(15),
				 observacao_for varchar(60) */
				
				
				fornecedores.add(fornecedor);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//Fechando conexão
			try {

				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				} 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return fornecedores;
	}

	public void updateNomeFornecedor(String nome, int codigo) throws Exception {
		String updateNome = "UPDATE FORNECEDOR SET NOME_FOR = ? WHERE COD_FOR = ?;";


		Connection conn = null;

		PreparedStatement pstm = null;


		//Tentando conectar ao banco

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement)conn.prepareStatement(updateNome);

			pstm.setString(1, nome);
			pstm.setInt(2, codigo);

			pstm.execute();
			System.out.println("Nome do fornecedor atualizado.");

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}

				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void deletarFornecedor(int codigo) throws Exception {
		String deletarNome = "DELETE FROM FORNECEDOR WHERE COD_FOR = ?;";


		Connection conn = null;

		PreparedStatement pstm = null;


		//Tentando conectar ao banco

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement)conn.prepareStatement(deletarNome);

			pstm.setInt(1, codigo);

			pstm.execute();
			System.out.println("\nFornecedor excluído.");

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}

				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
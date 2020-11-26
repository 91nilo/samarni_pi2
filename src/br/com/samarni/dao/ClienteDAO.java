package br.com.samarni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.samarni.factory.ConnectionFactory;
import br.com.samarni.model.Cliente;

public class ClienteDAO {
	//classe responsável pelo CRUD
	
	
	public void salvar(Cliente cliente) {
		String insertCliente = "INSERT INTO CLIENTE (cpf_cli, nome_cli, endereco_cli, cidade_cli, uf_cli, fone_cli, observacao_cli)"
				+ "	VALUES (?, ?, ?, ?, ?, ?, ?);";
		
		Connection conn = null;

		PreparedStatement pstm = null;
		
		//Tentando conectar ao banco
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement)conn.prepareStatement(insertCliente);	
			pstm.setString(1, cliente.getCpf());
			pstm.setString(2, cliente.getNome());
			pstm.setString(3, cliente.getEndereco());
			pstm.setString(4, cliente.getCidade());
			pstm.setString(5, cliente.getUf());
			pstm.setString(6, cliente.getTelefone());
			pstm.setString(7, cliente.getObservacao());
			
			pstm.execute();
			
			System.out.println("Cliente cadastrado.");
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
	public static List<Cliente> getClientes(){
		
		String read = "SELECT * FROM CLIENTE;";
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement)conn.prepareStatement(read);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Cliente cliente = new Cliente();
				cliente.setCpf(rset.getString("cpf_cli"));
				cliente.setNome(rset.getString("nome_cli"));
				cliente.setEndereco(rset.getString("endereco_cli"));
				cliente.setCidade(rset.getString("cidade_cli"));
				cliente.setUf(rset.getString("uf_cli"));
				cliente.setTelefone(rset.getString("fone_cli"));
				cliente.setTelefone(rset.getString("cod_cli"));
				cliente.setObservacao(rset.getString("observacao_cli"));
				
				clientes.add(cliente);
				
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
		return clientes;
	}
	
	public void updateNomeCliente(String nome, int codigo) throws Exception {
		String updateNome = "UPDATE CLIENTE SET NOME_CLI = ? WHERE COD_CLI = ?;";
	
		
		Connection conn = null;

		PreparedStatement pstm = null;
	
		
		//Tentando conectar ao banco
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement)conn.prepareStatement(updateNome);
			
			pstm.setString(1, nome);
			pstm.setInt(2, codigo);
			
			pstm.execute();
			System.out.println("Cadastro atualizado.");
			
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
	
	public void deletarCliente(int codigo) throws Exception {
		String updateNome = "DELETE FROM CLIENTE WHERE COD_CLI = ?;";
	
		
		Connection conn = null;

		PreparedStatement pstm = null;
	
		
		//Tentando conectar ao banco
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement)conn.prepareStatement(updateNome);
			
			//pstm.setString(1, nome);
			pstm.setInt(1, codigo);
			
			pstm.execute();
			System.out.println("\nCliente deletado.");
			
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

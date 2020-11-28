package br.com.samarni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.samarni.factory.ConnectionFactory;
import br.com.samarni.model.Usuario;

public class UsuarioDAO {
	//classe responsável pelo CRUD

	//comentario teste	
	public void salvar(Usuario usuario) {
		String insertUsuario = "INSERT INTO USUARIO (nome_usuario, cpf_usuario, login_usuario, senha_usuario, observacao_usuario)"
				+ "	VALUES (?, ?, ?, ?, ?);";

		Connection conn = null;

		PreparedStatement pstm = null;

		//Tentando conectar ao banco

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement)conn.prepareStatement(insertUsuario);	

			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getCPF());
			pstm.setString(3, usuario.getLogin());
			pstm.setString(4, usuario.getSenha());
			pstm.setString(5, usuario.getObservacao());
			
			
			pstm.execute();

			System.out.println("Usuario cadastrado.");
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
	public static List<Usuario> getUsuario(){

		String read = "SELECT * FROM USUARIO;";

		List<Usuario> usuarios = new ArrayList<Usuario>();

		Connection conn = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement)conn.prepareStatement(read);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Usuario usuario = new Usuario(read, read, read, read, read);
				//usuario.setCodigo(rset.getInt("cod_usuario"));
				usuario.setNome(rset.getString("nome_usuario"));
				usuario.setCPF(rset.getString("cpf_usuario"));
				usuario.setLogin(rset.getString("login_usuario"));
				usuario.setSenha(rset.getString("senha_usuario"));
				usuario.setObservacao(rset.getString("observacao_usuario"));
				
				
				
				usuarios.add(usuario);

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
		return usuarios;
	}

	public void updateNomeUsuario(String nome, int codigo) throws Exception {
		String updateNome = "UPDATE USUARIO SET NOME_USUARIO = ? WHERE COD_USUARIO = ?;";


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

	public void deletarUsuario(int codigo) throws Exception {
		String deletarNome = "DELETE FROM USUARIO WHERE COD_USUARIO = ?;";


		Connection conn = null;

		PreparedStatement pstm = null;


		//Tentando conectar ao banco

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement)conn.prepareStatement(deletarNome);

			//pstm.setString(1, nome);
			pstm.setInt(1, codigo);

			pstm.execute();
			System.out.println("\nUsuario deletado.");

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
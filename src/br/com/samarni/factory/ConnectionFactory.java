package br.com.samarni.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	//Usuario MySql
	private static final String USERNAME = "OTICA";
	//Senha do usuario MySql
	private static final String PASSWORD = "1234";
	//Caminho, porta e nome da database
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/PI2_OTICA?useTimezone=true&serverTimezone=UTC";
	
	//Conexão com o banco
	public static Connection createConnectionToMySQL() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Conectando com o banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		
		Connection con = createConnectionToMySQL();
		
		if(con!=null) {
			System.out.println("Conexão bem-sucedida.");
			con.close();
		}
	}
	
}

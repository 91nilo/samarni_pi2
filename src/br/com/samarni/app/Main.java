package br.com.samarni.app;

import br.com.samarni.dao.ClienteDAO;
import br.com.samarni.model.Cliente;

public class Main {

	public static void main(String[] args) {
		 
		Cliente cliente = new Cliente("00077733311", "Teste de Oliveira", "Rua do Teste, 30", 
				"Recife", "PE", "(81)3344-5566"," ");
		
		ClienteDAO clienteDao = new ClienteDAO();
		
		clienteDao.salvar(cliente);
		
		System.out.println("\nLista de Clientes:");
		//Listando Clientes
		for(Cliente c : ClienteDAO.getClientes()){
			System.out.println("Cliente: " + c.getNome());
		}
	}
	
	

}

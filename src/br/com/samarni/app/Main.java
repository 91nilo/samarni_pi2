package br.com.samarni.app;

import br.com.samarni.dao.ClienteDAO;
import br.com.samarni.model.Cliente;

public class Main {

	public static void main(String[] args) throws Exception {
		 
		/*Cliente cliente = new Cliente("00022233311", "Teste 7", "Rua do Teste, 1730", 
				"Paulista", "PE", "(81)99844-5566"," ");
		*/
		ClienteDAO clienteDao = new ClienteDAO();
		
		//clienteDao.salvar(cliente);
		
		System.out.println("\nLista de Clientes:");
		//Listando Clientes
		for(Cliente c : ClienteDAO.getClientes()){
			System.out.println("Cliente: " + c.getNome());
		}
		
		//clienteDao.updateNomeCliente("TESTE 12", (short)11);
		
		//clienteDao.deletarCliente((short)10);
		
		System.out.println("\nLista de Clientes - Atualizada:");
		//Listando Clientes
		for(Cliente c : ClienteDAO.getClientes()){
			System.out.println("Cliente: " + c.getNome());
		}
	}
	
	

}

package br.com.samarni.app;
import br.com.samarni.dao.FornecedorDAO;
import br.com.samarni.dao.UsuarioDAO;
import br.com.samarni.model.Fornecedor;
import br.com.samarni.model.Usuario;

public class Main {

	public static void main(String[] args) throws Exception {
		 
		/*Cliente cliente = new Cliente("00022233311", "Teste Agora", "Rua do Teste, 1730", 
				"Jaboat�o dos Guararapes", "PE", "(81)99854-5566"," ");
		
		ClienteDAO clienteDao = new ClienteDAO();
		
		//clienteDao.salvar(cliente);
		
		System.out.println("\nLista de Clientes:");
		//Listando Clientes
		for(Cliente c : ClienteDAO.getClientes()){
			System.out.println("Cliente: " + c.getNome());
		}
		
		//clienteDao.updateNomeCliente("Teste Rodrigues", 5);
		
		//clienteDao.deletarCliente(9);
		
		System.out.println("\nLista de Clientes - Atualizada:");
		//Listando Clientes
		for(Cliente c : ClienteDAO.getClientes()){
			System.out.println("Cliente: " + c.getNome());
			}*/
	
		//Teste Usu�rio
		UsuarioDAO usrDAO = new UsuarioDAO();
			/*Usuario usuario = new Usuario("Teste", "00031155599","smrnTeste", "123456","Administrador");
			
			usrDAO.salvar(usuario);
			
			System.out.println("\nLista de Usuarios:");
			//Listando Clientes
		
				//usrDAO.updateNomeUsuario("Teste 1", 1);
				usrDAO.deletarUsuario(1);
				System.out.println("\nLista de Usuarios atualizada:");
				//Listando Clientes
				for(Usuario u : UsuarioDAO.getUsuario()){
					System.out.println("Usuario: " + u.getNome());
				
			}
			 */
		
				FornecedorDAO frnDAO = new FornecedorDAO();
				//Fornecedor fornecedor = new Fornecedor("00031155599199", "Fornecedor Teste", "Rua do Teste, 440", "Recife","PE","8122223434", "tempor�rio");
				//cnpj_for, nome_for, endereco_for, cidade_for, "
				//+ "uf_for, fone_for, observacao_for
				//frnDAO.salvar(fornecedor);
				
				//Listando Clientes
			
					//frnDAO.updateNomeFornecedor("Teste 1", 1);
					frnDAO.deletarFornecedor(1);
					System.out.println("\nLista de Fornecedores atualizada:");
					//Listando Clientes
					for(Fornecedor f : FornecedorDAO.getFornecedor()){
						System.out.println("Fornecedor: " + f.getNome());
					
				}		
		}
	
	}	




package inputs;

import javax.swing.JOptionPane;

public class FornecedorInput {

	// metodo para que o usuario entre com o id do fornecedor
	// obs: o JOptionPane.showInputDialog so pega String, logo é necessário
	// converter
	public static Integer lerIdFornecedor() throws Exception {

		Integer idFornecedor = Integer.parseInt(JOptionPane.showInputDialog("Entre com o id do fornecedor: "));
		if(idFornecedor > 0) {
			return idFornecedor;	
			
		}else {
			throw new Exception("O id do fornecedor deve ser maior do que zero");
		}
		
		
	}

	// metodo para que o usuario entre com o nome do fornecedor
	public static String lerNome() throws Exception {

		String nome = JOptionPane.showInputDialog("Entre com o nome do fornecedor");
		
		if(nome.trim().length() >= 6 && nome.trim().length() <= 150) {
			return nome;	
		}
		else {
			throw new Exception("Nome do fornecedor deve ter entre 6 e 150 caracteres.");
		}
		
	}

	public static String lerCnpj() throws Exception {

		String cnpj = JOptionPane.showInputDialog("Entre com o cnpj do fornecedor");
		
		if(cnpj.trim().length() >= 14 && cnpj.trim().length() <=18) {
			return cnpj;
		}else {
			throw new Exception("CNPJ deve conte de 14 a 18 caracteres");
		}
		
	}

}

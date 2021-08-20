package inputs;

import javax.swing.JOptionPane;

import enums.TipoContratacao;

public class ProfissionalInput {
	
	//Método estatico para ler o id do profisisonal
	
	public static Integer lerIdProfissional()throws Exception{
		
		Integer idProfissional = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do profissional"));
	
		/*		if(idProfissional > 0 ){
		 * 		return idProfissional;
		 * }else{
		 * 	throw new Exception("O ID do profissional deve ser maior do que zero.");}
		 * 
		 * */
		
		if(idProfissional <= 0 ) {
			throw new Exception("O id do profissional deve ser maior do que zero.");}
		
		return idProfissional;
		
	}
	
	//método estatico para ler o nome do profissional
	
	public static String lerNome() throws Exception {
		
		String nome = JOptionPane.showInputDialog("Informe o nome  do profissional");
		
		if(nome.length() <= 3)
			throw new Exception(" O nome do profissional deve ter no mínimo 3 caracteres.");
		
			return nome;
		
	}
	
	//método estatico para ler o cpf do profissional
	
	public static String lerCpf() throws Exception {
		
		String cpf = JOptionPane.showInputDialog("Informe o cpf  do profissional");
		
		if(cpf.length() != 11)
			throw new Exception(" O cpf  deve conter exatamente 11 dígitos.");
		
			return cpf;
		
	}
	//método estatico para ler o cpf do profissional
	
	public static String lerTelefone() throws Exception {
		
		String telefone = JOptionPane.showInputDialog("Informe o telefone  do profissional");
		
		if(telefone.length() != 9)
			throw new Exception(" O telefone  deve conter exatamente 9 dígitos.");
		
			return telefone;
		
	}
	
	//Método para ler o tipo de contratação do profissional
	public static TipoContratacao lerTipoContratacao() throws  Exception{
		
		Integer tipoContratacao = Integer.parseInt(JOptionPane.showInputDialog("Informe (1) CLT, (2) ESTAGIO ou (3) TERCEIRIZADO:"));
		
		switch (tipoContratacao) {
		case 1:
			return TipoContratacao.CLT;		
		case 2:
			return TipoContratacao.ESTAGIO;
		case 3:
			return TipoContratacao.TERCEIRIZADO;
		default:
			throw new Exception("Tipo de contratação inválido.");
			
			
		}
		
		
		
		
	}
	
	
	
	
}

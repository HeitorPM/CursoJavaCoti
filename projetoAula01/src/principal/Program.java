//identifica��o do pacote (package)
package principal;

import entities.Cliente;

//defini��o da classe
//public -> modificador de visibilidade (acesso total)
public class Program {

	// m�todo (fun��o) que ser� responsavel por executar
	// o projeto (capacidade de 'executar' a classe)
	// ser� o ponto de partida para execu��o do projeto
	// ctrl + espa�o auto complete
	// snippet = abrevia��o
	
	// ctrl + shift + o = abrevia��o para importar classes 
	
	//ctrl +f11 tamb�m executa
	
	//segurando o control e clicar no cluiente() te leva pra classe
	public static void main(String[] args) {

		System.out.println("Aula 01 - JavaDeveloper");

		/*Nome da classe, nome da (vari�vel de) instancia = inicia��o da instancia*/
		Cliente cliente = new Cliente();
		
		//ou
		
		Cliente cliente2 = new Cliente(1,"Sergio Mendes","sergio.coti@gmail.com","123.456.789-00");

		
		//utilizando os m�todos set e get da classe
		cliente.setIdCliente(1);
		cliente.setNome("Sergio Mendes");
		cliente.setEmail("sergio.coti@gmail.com");
		cliente.setCpf("123.456.789-00");
		
		/*
		//imprimindo os dados do cliente
		System.out.println("ID DO CLIENTE....: " + cliente.getIdCliente());
		System.out.println("NOME.............: " + cliente.getNome());
		System.out.println("EMAIL............: " + cliente.getEmail());
		System.out.println("CPF..............: " + cliente.getCpf());
		*/
		
		System.out.println(cliente.toString());
		
	}
  
}

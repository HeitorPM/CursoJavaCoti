//identificação do pacote (package)
package principal;

import entities.Cliente;

//definição da classe
//public -> modificador de visibilidade (acesso total)
public class Program {

	// método (função) que será responsavel por executar
	// o projeto (capacidade de 'executar' a classe)
	// será o ponto de partida para execução do projeto
	// ctrl + espaço auto complete
	// snippet = abreviação
	
	// ctrl + shift + o = abreviação para importar classes 
	
	//ctrl +f11 também executa
	
	//segurando o control e clicar no cluiente() te leva pra classe
	public static void main(String[] args) {

		System.out.println("Aula 01 - JavaDeveloper");

		/*Nome da classe, nome da (variável de) instancia = iniciação da instancia*/
		Cliente cliente = new Cliente();
		
		//ou
		
		Cliente cliente2 = new Cliente(1,"Sergio Mendes","sergio.coti@gmail.com","123.456.789-00");

		
		//utilizando os métodos set e get da classe
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

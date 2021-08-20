package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Fornecedor;
import entities.Produto;

public class FornecedorRepository {

	
	public void exportarDados(Fornecedor fornecedor) throws Exception{
		
		PrintWriter writer = new PrintWriter( new File("C:\\Users\\heito\\Desktop\\fornecedor.txt"));
		
		//imprimindo os dados
		writer.println("\nDados do fornecedor: \n");
		writer.println("\tId do fornecedor...: " + fornecedor.getIdFornecedor());
		writer.println("\tNome...............: " + fornecedor.getNome());
		writer.println("\tCNPJ...............: " + fornecedor.getCnpj());
		writer.println("\tQtd de produtos....: " + fornecedor.getProdutos().size());
		
		//imprimir os produtos do fornecedor
		//foreach (para cada item da lista, leia um produto com o nome 'p')
		for(Produto p : fornecedor.getProdutos()) {
			writer.println("\nDados do produto: ");
			writer.println("\tId do produto...: " + p.getIdProduto());
			writer.println("\tNome............: " + p.getNome());
			writer.println("\tPreço...........: " + p.getPreco());
			writer.println("\tQuantidade......: " + p.getQuantidade());
			
		}
		writer.flush();//salvar
		writer.close();//fechar
	}
}

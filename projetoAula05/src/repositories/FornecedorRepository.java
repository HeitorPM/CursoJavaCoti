package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Fornecedor;
import factories.ConnectionFactory;
import interfaces.IFornecedorRepository;

public class FornecedorRepository implements IFornecedorRepository {

	@Override
	public void create(Fornecedor obj) throws Exception {

		String query = "INSERT INTO FORNECEDOR(NOME, CNPJ) VALUES(?, ?)";
		
		//abrindo uma conexão com o banco de dados
		Connection connection = ConnectionFactory.getConnection();
		
		//executando o comando SQL
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCnpj());
		
		statement.execute();
		statement.close();
		
		connection.close();
	}

	@Override
	public void update(Fornecedor obj) throws Exception {
		
		String query = "UPDATE FORNECEDOR SET NOME = ?, CNPJ = ? WHERE IDFORNECEDOR = ?";
		
		//abrindo uma conexão com o banco de dados
		Connection connection = ConnectionFactory.getConnection();
		
		//executando o comando SQL
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCnpj());
		statement.setInt(3, obj.getIdFornecedor());

		
		statement.execute();
		statement.close();
		
		connection.close();

	}

	@Override
	public void delete(Fornecedor obj) throws Exception {
		String query = "DELETE FROM FORNECEDOR WHERE IDFORNECEDOR = ?";
		
		//abrindo uma conexão com o banco de dados
		Connection connection = ConnectionFactory.getConnection();
		
		//executando o comando SQL
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, obj.getIdFornecedor());

		
		statement.execute();
		statement.close();
		
		connection.close();

	}

	@Override
	public List<Fornecedor> read() throws Exception {
		// TODO Auto-generated method stub
		
		String query = "Select * from fornecedor";
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement(query);
		//pega o retorno do executeQuery
		ResultSet result = statement.executeQuery();
		
		
		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		
		//o next é identico ao fetch next dos cursores
		while(result.next()) {
			
			//ler os dados de cada fornecedor obtido na consutla
			Fornecedor fornecedor = new Fornecedor();
			
			fornecedor.setIdFornecedor(result.getInt("IDFORNECEDOR"));
			fornecedor.setNome(result.getString("Nome"));
			fornecedor.setCnpj(result.getString("CNPJ"));
			
			lista.add(fornecedor);
		}
		
		statement.close();
		result.close();
		
		connection.close();
		
		
		return lista;
	}

}

package factories;

import java.sql.Connection;
import java.sql.DriverManager;

//fábrica de conexões...
public class ConnectionFactory {
	
	//atributos constantes
	//timezone e server timezone é por conta dos fusos, ssl é pra definir se é seguro ou n
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bdprojeto05?useTimezone=true&serverTimezone=UTC&useSSL=false";	private static final String DATABASE_USER = "root";
	private static final String DATABASE_PASSWORD = "7thson";
			
	/*Private static final --- precisa ser sempre iniciado, em caixa alta, e ele n pode ser alterado*/	
	//metodo para retornar uma conexao com o banco de dados
	public static Connection getConnection() throws Exception{
	//	retornar uma instancia de conexao com o mysql
		return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
	}
	
	
}

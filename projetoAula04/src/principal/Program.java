package principal;

import controllers.ProfissionalController;
import repositories.ProfissionalRepositoryTXT;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ProfissionalController profissionalController
			= new ProfissionalController
			(new ProfissionalRepositoryTXT());//polimorfismo


			profissionalController.executarExportacao();
			
			System.out.println("\nDados gravados com sucesso!");
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
			
			
	}

}

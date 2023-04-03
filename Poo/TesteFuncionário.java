package Poo;

public class TesteFuncionário {

	public static void main(String[] args) {
		
	Funcionário TesteFuncionário = new Funcionário("Luciano","gerente",8145,40,"lucianoag@gmail.com");
		
	TesteFuncionário.visualizarInfo();
	System.out.println("\n Troque a idade:");
	TesteFuncionário.setIdade(35);
		
	TesteFuncionário.visualizarInfo();	
	System.out.println("\n Troque o cargo:");
	TesteFuncionário.setCargo("Faxineiro");
	TesteFuncionário.visualizarInfo();
		
		
		
		
		
		
		
		
		
		

	}

}

package Poo;

public class TestaCliente {

	public static void main(String[] args) {
		
 ClasseCliente TestaCliente = new ClasseCliente("Flávia","Rua do Amor",555,28,"Feminino");
		
		TestaCliente.visualizarInfo();
		System.out.println("\n Mude o nome do Cliente");
		TestaCliente.setNome("Denise");
		
		TestaCliente.visualizarInfo();
		System.out.println("\n Mude o endereço");
		TestaCliente.setEndereço("Rua Feliz");
		TestaCliente.visualizarInfo();

	}

}

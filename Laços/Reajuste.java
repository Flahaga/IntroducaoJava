package Laços;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		
		    String nome;
			int cod,novosal,salário;
			
			 Scanner  Leia  = new Scanner(System.in);
			
			 System.out.println("\nDigite seu nome:");
				nome = Leia.next();
			 
			 System.out.println("\nTabela:");
				System.out.println("\n Codigo 1-Gerente -10% ");
				System.out.println("\nCodigo 2 - Vendedor - 7%");
				System.out.println("\nCodigo 3 - Supervisor - 9%");
				System.out.println("\nCodigo 4 - Motorista - 6%");
				System.out.println("\nCodigo 5 - Estoquista - 5%");
				System.out.println("\nCodigo 6 - Técnico de TI -8%");
				System.out.println("\nDigite o código do cargo: ");
				cod = Leia.nextInt();
				System.out.println("\nDigite o salário: ");
				salário = Leia.nextInt();
				
				switch(cod) {
				case 1:
					novosal= salário + (10/100* salário);

				System.out.println("\nCargo:Gerente - Valor do reajuste: "+novosal);
				break;
				case 2:
					novosal= salário + (7/100* salário);
				System.out.println("\nCargo: Vendedor - Valor do reajuste: "+novosal);
					break;
				case 3:
					novosal= salário + ( 9/100*salário);
				System.out.println("\nCargo: Supervisor - Valor do reajuste: "+novosal);
					break;
				case 4:
					novosal= salário + (6/100* salário);
					System.out.println("\nCargo: Motorista - Valor do reajuste: "+novosal);
					break;
				case 5:
					novosal= salário + (5/100* salário);
					System.out.println("\nCargo: Estoquista -Valor do reajuste: "+novosal);
					break;
				case 6:
					novosal= salário + (8/100* salário);
					System.out.println("\nCargo: Técnico de TI - Valor do reajuste: "+novosal);
					break;
					default:
						System.out.println("\nOpção Inválida");
				}

		
		
		
		
		

	}
				

}

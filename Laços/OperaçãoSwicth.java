package Laços;

import java.util.Scanner;

public class OperaçãoSwicth {

	public static void main(String[] args) {
		
		int n1,n2,código,resultado;
		
		 
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\n Digite o número 1 :");
		n1 = leia.nextInt();
		System.out.println("\n Digite o número 2 :");
		n2 = leia.nextInt();
		
		System.out.println("\n Operações :");
		System.out.println("\n Código 1 - Soma :");
		System.out.println("\n Código 2 - Subtração :");
		System.out.println("\n Código 3 - Multiplicação :");
		System.out.println("\n Código 4 - Divisão :");
		System.out.println("\n Digite o código da operação :");
		código = leia.nextInt();
		
		switch(código) {
		case 1:
			resultado =(n1+n2);
			System.out.println("\n O resultado da Soma é: "+resultado);
		break;
		case 2:
			resultado =(n1-n2);
			System.out.println("\n O resultado da Subtração é: "+resultado);
			break;
		case 3:
			resultado =(n1*n2);
			System.out.println("\n O resultado da Multiplicação é: "+resultado);
			break;
		case 4:
			resultado =(n1/n2);
			System.out.println("\n O resultado da Divisão é: " +resultado);
			break;
			default:
				System.out.println("\nOpção Inválida");
		}

		
		
	}

}

package Estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

public static void main(String[] args) {
		
		 Queue <String> fila = new LinkedList <String> ();
		
		 int op;	
		String nome; 
		Scanner leia = new Scanner(System.in);
	while(true)	{
		
		System.out.println("\n-------------------------------------------------");
		System.out.println("\n(1) Adicionar um novo Cliente na fila.");
		System.out.println("\n(2)Listar todos os Clientes na fila.");
		System.out.println("\n(3) Chamar (retirar) uma pessoa da fila.");
		System.out.println("\n(0) Deseja sair do sistema?");
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nPor favor, digite sua opção: ");
			op = leia.nextInt();
		 
			switch(op) {
			case 1:	
	        System.out.println("\nAdicionar um novo Cliente" );
	        System.out.println("\n Digite seu nome:");
	        nome = leia.next();
	        System.out.println("\n Adicionar um novo Cliente" +fila.add(nome));
	        break;
			case 2 :
			System.out.println("\nListar todos os Clientes na fila." +fila);
	        break;
			case 3 :	  
	      System.out.println("\n Chamar (retirar) uma pessoa da fila."+fila.remove());
	      break; 
	       default :
		  System.out.println("\nObrigado por visitar nosso sistema!");	
			
			}		
		

	}

}
}
package Estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
	
	    int opção;	
		String nome;
		
		Scanner leia = new Scanner(System.in);
	while(true)	{
		
		System.out.println("\n Menu:");
		System.out.println("\n 1- Adicionar um novo livro" );
		System.out.println("\n 2 - Listar todos os livros da pilha" );
		System.out.println("\n 3 - Retirar livros da pilha");
		System.out.println("\n 0 - Sair do menu");
		System.out.println("\n Digite a opção que deseja:");
		opção = leia.nextInt();

		
		switch(opção) {
		  case 1 :
		 System.out.println("\n Adicionar um novo livro" );
		 System.out.println("\n Digite o nome do livro:");
	     nome = leia.next();
	    System.out.println("\n Livro adicionado");
	     pilha.push(nome);
		  break;
		
		  case 2 :
	   System.out.println("\n  Todos os livros são:" +pilha);
		break;
		    
		  case 3 :
		 System.out.println("\n O livro retirado foi:" +pilha.pop());
          break;
		default:
		System.out.println("\n Obrigada por visitar nosso sistema!");
		}
}

}
}
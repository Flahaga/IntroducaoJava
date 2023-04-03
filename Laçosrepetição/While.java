package Laçosrepetição;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		

		int num, somaIdadeMenor = 0, somaIdadeMaior = 0;
		   
		Scanner leia = new Scanner(System.in);	     
	        	       
	        System.out.println("Digite aqui a idade: ");
	        num = leia.nextInt();
	        while (num >= 0) {
	            if (num < 21) {
	                somaIdadeMenor++;
	            }
	            if (num > 50) {
	                somaIdadeMaior++;
	            }
	            System.out.println("Digite aqui o valor de idade: ");
	            num = leia.nextInt();

	        }
	        System.out.println("Total de pessoas menores de 21 anos: " + somaIdadeMenor);
	        System.out.println("Total de pessoas maiores de 50 anos: " + somaIdadeMaior);
	    }

	

}

package Atividade9;

import java.util.Scanner;

public class Notasponderadas {

	public static void main(String[] args) {
		Double nota1,nota2,nota3,peso1,peso2,peso3,peso5,mediap;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nDigite a nota1:");
		nota1= leia.nextDouble();
		
		System.out.print("\nDigite a nota2:");
		nota2= leia.nextDouble();
		
		System.out.print("\nDigite a nota3:");
	  nota3= leia.nextDouble();
	  
	  peso1=2.0; 
	  peso2=3.0;
	  peso3=5.0;

     mediap= (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 ) /peso1 + peso2 + peso3;
  
    		 System.out.print("\nA médiaponderada é:" +mediap);
	}
	
}







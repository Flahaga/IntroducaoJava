package Atividade1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		float salario,abono,nsalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu salário:");
		salario = (float) leia.nextDouble();
       System.out.println("\nDigite seu abono");
       abono = (float) leia.nextDouble();
	    nsalario = salario + abono;
	    System.out.printf("O seu novo salário é %2f",nsalario);
	
	}
}
 
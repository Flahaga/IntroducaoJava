package Atividade3;

import java.util.Scanner;

public class Salarioliquido {

	public static void main(String[] args) {
		
	float salariobruto,adicional,horasextras,descontos,salarioliquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu salário bruto:");
		salariobruto = (float) leia.nextDouble();
		System.out.println("\nDigite seu adicional:");
		 adicional= (float) leia.nextDouble();
		 System.out.println("\nDigite suas horas extras:");
		 horasextras= (float) leia.nextDouble();
		 System.out.println("\nDigite seus descontos:");
		 descontos= (float) leia.nextDouble();
		 
		
		 salarioliquido = salariobruto + adicional + (horasextras * 5)- descontos;
				 
	  System.out.println("\nSeu salario liquido é:" +salarioliquido);

	}
}
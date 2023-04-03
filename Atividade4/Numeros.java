package Atividade4;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		int n1,n2,n3,n4, diferença;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o numero 1:");
		n1 = (int) leia.nextDouble();
		System.out.println("\nDigite o numero 2:");
		n2 = (int) leia.nextDouble();
		System.out.println("\nDigite o numero 3:");
		n3 = (int) leia.nextDouble();
		System.out.println("\nDigite o numero 4:");
		n4 = (int) leia.nextDouble();
		
		diferença = (n1*n2) - (n3*n4);

		System.out.println("\nA diferença é:"+diferença);
	
	}

		}

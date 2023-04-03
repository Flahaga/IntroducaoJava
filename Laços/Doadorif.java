package Laços;

import java.util.Scanner;

public class Doadorif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade,doação;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite seu nome");
		nome = leia. next();
		
		System.out.println("\n Digite sua idade");
		idade = leia.nextInt();
		
		System.out.println("\n Confira sua idade");
		doação = leia.nextInt();
		
		if(doação>18 && doação<=69) {
			System.out.println("\nParabéns, você pode doar");
		}
		else if(doação>=60 && doação<=69) {
			System.out.println("\nAtenção não é sua primeira doação");
		}
		else if(doação>=1 && doação<=17) {
			System.out.println("\n Não pode doar");
		}
		else {
			System.out.println("\nPor favor, verifique se está apto ou não para a doação!!!");
		}
	}
	}
	  

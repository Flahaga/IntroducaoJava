package atividade8;

import java.util.Scanner;

public class cálculo {

	public static void main(String[] args) {
		int a,b,c,r,s,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nDigite o valor de a:");
		a= leia.nextInt();
		
		System.out.print("\nDigite o valor de b:");
		b= leia.nextInt();
		
		System.out.print("\nDigite o valor de c:");
	 c= leia.nextInt();
	
	 r=(int) Math.pow((a + b), 2);
	 s=(int) Math.pow((b + c), 2);
      d=(r + s) /2;

      System.out.print("\nO resultado de d é :" + d);
	} 
	
}
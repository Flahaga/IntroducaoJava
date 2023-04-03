package Exercíciosextrasrepetição;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int idade,código,adjetivo,x,pn40 = 0,pc18 = 0,mn = 0,pc = 0,ha = 0,oc = 0;
		
		Scanner leia = new Scanner(System.in);
		for (x=1 ;x<=150;x++);
		
		System.out.println("\n Digite sua idade :");
		idade = leia.nextInt();
		
		System.out.println("\n Digite o código da sua identificação de genero :");
		System.out.println("\n Código 1 - Feminino  :");
	    System.out.println("\n Código 2 - Masculino  :");
	    System.out.println("\n Código 3 - Outros - :");
	    System.out.println("\n Digite o número do código :");
	     código= leia.nextInt();
	    System.out.println("\n Digite o número do ajetivo que te representa :");
	    System.out.println("\n Código 1 - Calme :");
	    System.out.println("\n Código 2 - Nervose :");
	    System.out.println("\n Código 3 - Agressive :");
	    adjetivo= leia.nextInt();
	     
	     while (idade>40) {
	              pn40++;
	  System.out.println("\n O número de pessoas nervosas com mais de 40 é :" +pn40);
	    
	     }  if(idade < 0) {
	     } else if (idade < 18) {                      
	    	 pc18++;
	 System.out.println("\n O número de pessoas calmas com menos de 18 é :" +pc18);
	     }
     
	    
	 System.out.println("\n O número de pessoas calmas é :" +pc);
     System.out.println("\n O número de mulheres nervosas é :" +mn);
     System.out.println("\n O número de homens agressivos é :" +ha);
     System.out.println("\n O número de outros calmos é :" +oc);  
	     }     
	     

	

{

}
}
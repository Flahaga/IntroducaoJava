package Arrays;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
	  int[]	 índices ={2,5,1,3,4,9,7,8,10,6};
	  
	  int  x,número,Soma = 0,Média,par,ímpar;
	  
	  Scanner leia = new  Scanner(System.in);
	 
	  
	  System.out.println("\n Digite um número");
	  número= leia.nextInt();
	  for(x=0;x<10;x++) { 
	  if(número==índices[x]) {
	  
	  }  
		  if(número %2 == 0) {
	   System.out.println("\n Este número é par!" );
	
		  }
	  
		  if(número %2 == 1) {
      System.out.println("\n Este número é ímpar!");
	   
		  }  
	  
	   Soma = (número + índices[x]);
	     System.out.println("\n A soma total é:" +Soma);
	       

	  Média = (Soma /10) ;
	  System.out.println("\n A média é:" +Média);
	
	  System.out.println("\n Os números pares +par+ são:" +índices[x]);
	  System.out.println("\n Os números ímpares  +ímpar+ são:" +índices[x]);
	


}
}
}
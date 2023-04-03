package Arrays;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		int[] numeros = {2,5,1,3,4,9,7,8,10,6};
 
	   Scanner leia = new Scanner(System.in);
	  
	   int numero,aux=-1;
	   
	   System.out.println("\n Digite um numero:");
	   numero = leia.nextInt();
	    for( int x=0;x<10;x++) {
	    if (numero == numeros[x]) {
		       aux = x;
	      }
		  
	    }	  
		  
	    if (aux != -1) { 
	    	 System.out.println("\n O número: +numero+ posição" +aux);
		
	      }		
	    else {
				
	    	System.out.println("\n O número não foi encontrado");
		  }		
		
				

	
	}
	      

	      
	      
	            
	   }
			   
	   
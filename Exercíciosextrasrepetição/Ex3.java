package Exercíciosextrasrepetição;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
	int  idade,quant21=0,quant50=0;	
		
      Scanner leia = new Scanner(System.in);
	
        System.out.println("\n Digite sua idade");
        idade = leia.nextInt();
         while (idade > 0) { 
    	  if (idade < 21){
            	quant21++;
            	
            }  else if(idade >50) {
            	quant50++;
            
            	System.out.println("\n Digite sua idade :"); 	
            	idade = leia.nextInt();
            	
            }
         
            
           
            System.out.println("\n O total de pessoas com menos de 21 são :" +quant21); 	
            System.out.println("\n O total de pessoas com mais de 50 são :" +quant50);
        }
        
      
      
      
      
	}

}

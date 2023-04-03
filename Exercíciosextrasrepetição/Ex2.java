package Exercíciosextrasrepetição;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
		
		int x, num,par = 0,ímpar= 0;
		
        Scanner leia = new Scanner(System.in);
	
	     for(x=1;x<=10;x++) {
	
	     }  System.out.println("\n Digite um número ");
	     num = leia.nextInt();
	    	 
	        if(num %2==0) {
	    	 if(num <0) {
	    		par = par+1;
	     }       System.out.println("\n O total de par é "  +par);
	         
	          if(num<0) {
	        	ímpar=-1;
	}            System.out.println("\n O total de ímpar é "  +ímpar);

}

	     }
}
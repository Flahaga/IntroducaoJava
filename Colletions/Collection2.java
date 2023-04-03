package Colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList<Integer> Números = new ArrayList<Integer>();
      
		int número;
         Scanner leia =  new Scanner(System.in);
	 // números adicionados //
         Números.add(2);
         Números.add(5);
         Números.add(1);
         Números.add(3);
         Números.add(4);
         Números.add(9);
         Números.add(7);
         Números.add(8);
         Números.add(10);
         Números.add(6);
        
       
         for(Integer ListaInteiros: Números) {
              
        	 System.out.println(ListaInteiros);
        }
         
         System.out.println("\n Os números adicionados são:" +Números);
         System.out.println("\n A  primeira posição é :" +Números.get(1));
         System.out.println("\n A  segunda posição é :" +Números.get(2));
         System.out.println("\n A  terceira posição é :" +Números.get(3));
         System.out.println("\n A  quarta posição é :" +Números.get(4));
         System.out.println("\n A  quinta posição é :" +Números.get(5));
         System.out.println("\n A  sexta posição é :" +Números.get(6));
         System.out.println("\n A  sétima posição é :" +Números.get(7));
         System.out.println("\n A  oitava posição é :" +Números.get(8));
         System.out.println("\n A  nona posição é :" +Números.get(9));
         System.out.println("\n Digite um número");
         número = leia.nextInt();
          
         if(número>10) {
        	 System.out.println("\n Este número não foi encontrado");
         } 
        
       
         
         
		}	
 
	}
 
		

		
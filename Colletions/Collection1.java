package Colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		 String cor;
		int x;
		Scanner leia = new Scanner (System.in);
	
		for (x=0;x<=4;x++) {
		
		System.out.println("\n Digite a cor :");
		cor = leia.next();
		
      System.out.println("\n Esta cor foi adicionada:" +cores.add(cor));
      System.out.println("\n A lista de cores é :" +cores);
		
      Collections.sort(cores);
     System.out.println("\nDepois de ordenado, vai ficar assim...");
	 System.out.println(cores);
		

}
	}
}
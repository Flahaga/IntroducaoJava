package Exercíciosextrasrepetição;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int x,num,Total = 0;
		 
		for (x=1000; x<=1999; x++) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o número");
		num= leia.nextInt();
		
		    if(x % 11==5) {
		    		System.out.println("\n O total de números é :"  +x);
	}

}

}
	
}
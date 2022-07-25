package arrayDesafio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números você ira digitar: ");
		int cont = scan.nextInt();
		int cont02 = 0;
		double evenNumber = 0.0;
		double even;
		
		Integer[] number = new Integer[cont];
		System.out.println();
		
		System.out.println("Digite os números: ");
		for(int i=0; i<number.length; i++) {
			number[i] = scan.nextInt();
		}
		
		for(int i=0; i<number.length; i++) {
			if(number[i]%2 == 0) {
				evenNumber += (double) number[i];
				cont02++;
			}
		}
		if(evenNumber != 0) {
			even = evenNumber / cont02;
			System.out.printf("MÉDIA DOS NÚMEROS PARES: %.1f\n", even);
		}else {
			System.out.println("NÃO HÁ NÚMERO PAR!");
		}
				
		
		
		scan.close();
	}

}

package arrayDesafio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Quantos números você quer digitar? ");
		int cont = scan.nextInt();
		Integer[] number = new Integer[cont];
		
		for(int i=0; i<number.length; i++) {
			number[i] = scan.nextInt();
		}
		
		for(int i=0; i<number.length; i++) {
			if(number[i] %2 == 0  ) {
				System.out.printf("%d ", number[i]);
				sum++ ;
			}
		}
		System.out.printf("\n\nQuantidade de pares = %d\n", sum);
		scan.close();

	}

}

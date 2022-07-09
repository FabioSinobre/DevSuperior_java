package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition02 {
	/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
	 * inclusive o X, se for o caso.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, impar, divide;
		
		System.out.println("Digite um valor:");
		x = scan.nextInt();
		
		if(x <= 1 || x <=1000) {
			for(int i = 0; i <= x; i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		scan.close();
	}

}

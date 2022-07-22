package arrayDesafio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos valores terá cada Vetor? ");
		int cont= scan.nextInt();
		
		Integer[] numberOne = new Integer[cont];
		Integer[] numberTwo = new Integer[cont];
		Integer[] sumNamber = new Integer[cont];
		
		System.out.println("Digite os valores do vetor A");
		for(int i=0; i<numberOne.length; i++) {
			numberOne[i] = scan.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B");
		for(int i=0; i<numberTwo.length; i++) {
			numberTwo[i] = scan.nextInt();
		}
		
		for(int i=0; i<cont; i++ ) {
			sumNamber[i] = numberOne[i] + numberTwo[i];
		}
		System.out.println("Vetor resultante: ");
		
		for(int i=0; i<cont; i++ ) {
			System.out.println(sumNamber[i]);
		}
		scan.close();
	}

}

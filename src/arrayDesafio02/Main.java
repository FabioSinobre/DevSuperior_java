package arrayDesafio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos números você quer digitar? ");
		int cont = scan.nextInt();
		double sum = 0.0;
		
		Double[] value = new Double[cont];
		
		for(int i=0; i<value.length; i++) {
			System.out.println("Digite um número: ");
			value[i] = scan.nextDouble();
		}
		
		for(int i=0; i<value.length; i++) {
			System.out.printf("valores = %.2f%n", value[i]);
			sum += value[i];
		}
		
		double average = sum / cont;
		
		System.out.printf("Soma = %.2f%n", sum);
		System.out.printf("Média = %.2f%n", average);
		scan.close();

	}

}

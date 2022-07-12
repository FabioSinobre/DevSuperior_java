package objectOriented06.application;

import java.util.Scanner;

import objectOriented06.utility.Converter;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite quantos dolar: R$ ");
		double amount = scan.nextDouble();
		
		System.out.print("Digite o valor do dolar: R$ ");
		double dollarPrice = scan.nextDouble();
		
		double result = Converter.valueDollar(amount, dollarPrice);
		
		System.out.printf("Você pagará R$ %.2f\n", result);
		
		scan.close();
	}

}

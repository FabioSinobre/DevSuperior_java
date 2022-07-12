package objectOriented02.application;

import java.util.Locale;
import java.util.Scanner;

import objectOriented02.entiti.Product;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String name = scan.nextLine();
		
		System.out.print("Preço R$ ");
		double price = scan.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantity = scan.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println(product);
		
		scan.close();
	}

}

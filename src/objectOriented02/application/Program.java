package objectOriented02.application;

import java.util.Locale;
import java.util.Scanner;

import objectOriented02.entiti.Product;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product.name = scan.nextLine();
		
		System.out.print("Preço R$ ");
		product.price = scan.nextDouble();
		
		System.out.print("Quantidade: ");
		product.quantity = scan.nextInt();
		
		System.out.println(product);
		
		scan.close();
	}

}

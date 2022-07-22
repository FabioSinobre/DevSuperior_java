package estrutura.array02;

import java.util.Locale;
import java.util.Scanner;

import estrutura.array02.entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos a serem registrados:");
		int cont = scan.nextInt();
		
		Product[] product = new Product[cont];
		
		for(int i = 0; i < product.length; i++) {
			scan.nextLine();
			System.out.println("Digite o nome do produto: ");
			String name = scan.nextLine();
			System.out.println("Digite o valor R$ ");
			double price = scan.nextDouble();
			
			product[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < product.length; i++) {
			sum += product[i].getPrice();
		}
		
		double media = sum / cont;
		
		System.out.printf("A média dos valores R$ %.2f%n", media);
		
		// imprime o endereço do obj, cada espaço reservado para os array
		for(int i=0; i < product.length; i++) {
			System.out.println(product[i]);
		}
		
		scan.close();
	}

}

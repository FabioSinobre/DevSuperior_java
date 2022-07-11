package objectOriented03.application;

import java.util.Scanner;

import objectOriented03.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Digite a largura do retângulo: ");
		rectangle.width = scan.nextDouble();
		System.out.print("Digite a altura do retângulo: ");
		rectangle.height = scan.nextDouble();
		
		System.out.println(rectangle);
		
		scan.close();
	}

}

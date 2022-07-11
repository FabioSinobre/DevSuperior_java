package objectOriented05.applicaction;

import java.util.Scanner;

import objectOriented05.utility.Calculator;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double radius = scan.nextDouble();
		
		double circumference = Calculator.circumference(radius);
		
		double volume = Calculator.volume(radius);
		
		System.out.printf("Circunferência: %.2f\n", circumference);
		System.out.printf("Circunferência: %.2f\n", volume);
		System.out.printf("Circunferência: %.2f\n", Calculator.PI);
		scan.close();
	}

}

package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition05 {

	public static void main(String[] args) {
		/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro 
		 * pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		Scanner scan = new Scanner(System.in);
		double[] listaNumero = new double[6];
		double a, b, c;
		
		
		
		for(int i = 0; i < listaNumero.length; i++) {
			System.out.println("Digite o número:");
			listaNumero[i] = scan.nextDouble();
		}
		
		if(listaNumero[1] != 0) {
			a = listaNumero[0] / listaNumero[1];
			System.out.printf("%.2f%n", a);
		}else {
			System.out.println("Divisão impossivel!");
		}
		
		if(listaNumero[3] != 0) {
			b = listaNumero[2] / listaNumero[3];
			System.out.printf("%.2f%n", b);
		}else {
			System.out.println("Divisão impossivel!");
		}
		
		if(listaNumero[5] != 0) {
			c = listaNumero[4] / listaNumero[5];
			System.out.printf("%.2f%n", c);
		}else {
			System.out.println("Divisão impossivel!");
		}
		
		scan.close();
	}

}

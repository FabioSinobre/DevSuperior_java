package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition07 {

	public static void main(String[] args) {
		/* Ler um número inteiro N e calcular todos os seus divisores.*/
		Scanner scan = new Scanner(System.in);
		int calcularDivisores;
		
		System.out.println("Digite o número para conhecer seus divisores: ");
		calcularDivisores = scan.nextInt();
		
		for(int i = 1; i <= calcularDivisores; i++) {
			if(calcularDivisores % i == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}

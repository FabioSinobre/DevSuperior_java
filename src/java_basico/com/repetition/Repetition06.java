package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition06 {

	public static void main(String[] args) {
		/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * 
		 * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
		 */
		Scanner scan = new Scanner(System.in);
		int fatorial = 1;
		int numeroFatorial;
		
		System.out.println("Digite o fatorial a ser calculado");
		numeroFatorial = scan.nextInt();
		
		for(int i = 1; i <= numeroFatorial; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		scan.close();
	}

}

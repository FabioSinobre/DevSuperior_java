package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition08 {

	public static void main(String[] args) {
		/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N 
		 * linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo 
		 * do valor, conforme exemplo
		 */
		Scanner scan = new Scanner(System.in);
		int numeroEntrada, quadrado, cubo;
		
		System.out.println("Digite um número para ver seu valor ao quadrado e ao cubo:");
		numeroEntrada = scan.nextInt();
		
		if(numeroEntrada > 0) {
			for(int i = 0; i <= numeroEntrada; i++) {
				int x = i;
				quadrado = i * i;
				cubo = i * i * i;
				System.out.println(x + " " + quadrado + " " + cubo);
			}
		}else {
			System.out.print("O número não pode ser menor que 1 :");
		}
		
		scan.close();
	}

}

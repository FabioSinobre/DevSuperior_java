package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition04 {

	public static void main(String[] args) {
		/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste 
		 * consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada 
		 * um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e 
		 * o terceiro valor tem peso 5.*/
		Scanner scan = new Scanner(System.in);
		
		double[] nota = new double[3];
		double media = 0;
		double mediaFinal;
		
		for(int i = 0; i < nota.length; i++) {
			System.out.println("Digite as nota " + (i + 1));
			nota[i] = scan.nextDouble();
			if(i == 0) {
				nota[0] *=3;
			}else if(i == 1) {
				nota[1] *= 2;
			}else {
				nota[2] *= 5;
			}
		}
		for(int i = 0; i < nota.length; i++) {
			media += nota[i];
		}
		
		mediaFinal = media / 10;
		
		System.out.printf("Média final %.1f", mediaFinal);
		
		
		
		scan.close();
	}

}

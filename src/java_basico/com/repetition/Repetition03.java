package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition03 {

	public static void main(String[] args) {
		/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
		 * mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" 
		 * para fora do intervalo).
		 */ 
		Scanner scan = new Scanner(System.in);
		int quantidade, number;
		int in = 0;
		int out = 0;
		
		System.out.println("Digite a quantidade de números");
		quantidade = scan.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("Digite o número:");
			number = scan.nextInt();
			if(number >= 10 && number <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.println(in + " in" + "\n" + out + " out");
		
		scan.close();
	}

}

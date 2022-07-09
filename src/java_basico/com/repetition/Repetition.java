package java_basico.com.repetition;

import java.util.Scanner;

public class Repetition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int namber;
		int soma = 0;
		
		System.out.println("Digite o número e aperte entre e digite outro número");
		
		for(int i = 1; i <= 3; i++) {
			namber = scan.nextInt();
			soma += namber;
		}
		System.out.println(soma);
		
		scan.close();
	}

}

package arrayDesafio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 10 ");
		int cont = scan.nextInt();
		
		Integer[] numberPositive = new Integer[cont];
		
		if(cont>0 || cont<10) {
			
			for(int i=0; i<numberPositive.length; i++) {
				System.out.println("Digite um número: Positivo ou Negativo ");
				numberPositive[i] = scan.nextInt();
			}
		}
		
		System.out.println("Os números negativos digitados são:  ");
		for(int i=0; i<numberPositive.length; i++) {
			if(numberPositive[i] < 0) {
				System.out.println(numberPositive[i]);
			}
		}
		
		scan.close();
	}

}

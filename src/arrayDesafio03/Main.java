package arrayDesafio03;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão registradas? ");
		int cont = scan.nextInt();
		
		double sum = 0.0;
		double percent;
		double sumPercent = 0.0;
		
		String[] name = new String[cont];
		Integer[] age = new Integer[cont];
		Double[] height = new Double[cont];
				
		for(int i=0; i < cont; i++) {
			System.out.println("Dados da " + (i+1) + "°");
			System.out.println("Nome:  ");
			name[i] = scan.nextLine();
			scan.nextLine();
			System.out.println("Idade: ");
			age[i] = scan.nextInt();
			System.out.println("Altura: ");
			height[i] = scan.nextDouble();
		}
		
		for(int i=0; i<cont; i++) {
			sum += height[i];
		}
		double average = sum/cont;
		
		for(int i=0; i<cont; i++) {
			if(age[i] < 16) {
				sumPercent += 1;
			}
		}
		percent = (100*sumPercent) / cont;
		
		System.out.printf("Altura média: %.2f\n", average);
		System.out.printf("Pessoas com menos de 16 anos: %.2f\n", percent);
		
		
		
		
		scan.close();
	}

}

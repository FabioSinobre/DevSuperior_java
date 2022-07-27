package arrayDesafio08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int olderAge, higherPosition;
		
		System.out.println("Quantas pessoas sarão registradas? ");
		int cont = scan.nextInt();
		
		String[] name = new String[cont];
		Integer[] age = new Integer[cont];
		
		for(int i=0; i<age.length; i++) {
			System.out.println("Digite o nome: ");
			name[i] = scan.next();
			System.out.println("Digite a idade: ");
			age[i] = scan.nextInt();
		}
		
		higherPosition = 0;
		olderAge = age[0];
		
			
		for(int i=0; i<age.length; i++) {
			if(age[i] > olderAge ) {
				olderAge = age[i];
				higherPosition = i;
			}
		}
		
		System.out.printf("A pessoa mais velha é:%s\n ", name[higherPosition]);
		scan.close();
	}

}

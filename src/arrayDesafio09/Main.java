package arrayDesafio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont;
		System.out.println("Quantos alunos serão digitados? ");
		cont = scan.nextInt();
		
		String[] name = new String[cont];
		Double[] nota01 =  new Double[cont];
		Double[] nota02 = new Double[cont];
		
		for(int i=0; i<cont; i++) {
			System.out.println("Digite o nome do aluno, a primeira e a segunda nota: ");
			name[i]= scan.next();
			nota01[i] = scan.nextDouble();
			nota02[i] = scan.nextDouble();
			
		}
		System.out.println("Alunos aprovados: ");

		for(int i=0; i<cont; i++) {
			if((nota01[i]+nota02[i])/2 > 6.0) {
				System.out.println(name[i]);				
			}
		}		
		scan.close();
	}

}

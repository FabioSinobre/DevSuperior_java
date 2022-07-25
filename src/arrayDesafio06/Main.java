package arrayDesafio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double average = 0.0;
		// Sint n = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas notas você quer digitar? ");
		int cont = scan.nextInt();
		Double[] grade = new Double[cont];

		for (int i = 0; i < grade.length; i++) {
			System.out.println("Digite a " + i + 1 + "° nota: ");
			grade[i] = scan.nextDouble();
			average += grade[i];
		}
		double averageGrade = average / cont;
		System.out.printf("%.3f\n", averageGrade);

		System.out.println("Notasa abaixo da média: ");
		for (int i = 0; i < grade.length; i++) {
			if(grade[i] < averageGrade) {
				System.out.printf("%.2f\n", grade[i]);
			}
		}

		scan.close();
	}

}

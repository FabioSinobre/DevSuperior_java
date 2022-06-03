package java_basico.com.structura;

import java.util.Scanner;

public class Structure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d, sum, difference, ra;
		double workHours;
		double valueHours;
		double salary;
		double PI = 3.14159;
		double raio;
		double area;
			
		System.out.println("Digite um número de 1 a dez para escolher a formula");
		int number = scan.nextInt();
		switch(number) {
		case 1:
			System.out.println("Digite o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo número para realizar a soma: ");
			b = scan.nextInt();
			sum = a+b;
			System.out.println("A soma de A + B é: " + sum);
			break;
		case 2:
			System.out.println("Digite o raio para cálcular a área do círculo: ");
			raio = scan.nextDouble();
			area = 2*PI*raio*raio;
			System.out.printf("A área é de: %.2f", area);
			break;
		case 3:
			System.out.println("Digite o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo número: ");
			b = scan.nextInt();
			System.out.println("Digite o terceiro número: ");
			c = scan.nextInt();
			System.out.println("Digite o quarto número: ");
			d = scan.nextInt();
			difference = a*b-c*d;
			System.out.println("A diferença entre os 4 números é: " + difference);
			break;
		case 4:
			System.out.println("Digite o RA do funcionário: ");
			ra = scan.nextInt();
			System.out.println("Quantidade de horas que o funcionário trabalhor: ");
			workHours = scan.nextDouble();
			System.out.println("Valor por hora: ");
			valueHours = scan.nextDouble();
			salary = workHours * valueHours;
			System.out.println("número do funcionário = " + ra);
			System.out.printf("Salário = R$ %.2f", salary);
			break;
			
		}
		
		
	}

}

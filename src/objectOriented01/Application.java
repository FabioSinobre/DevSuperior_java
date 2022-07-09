package objectOriented01;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		/* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
		 * Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a 
		 * maior área. A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c 
		 * é a seguinte (fórmula de Heron): area
		 */
		Scanner scan = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do trinagulo A:");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Digite as medidas do segundo triangulo B:");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Área do triangulo X: " + areaX);
		System.out.println("Área do triangulo Y: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("O tríangulo com a área maior é o trinagulo X3: " + areaX);
		}else {
			System.out.println("O trinagulo com a área maior é Y: " + areaY);
		}
		
		scan.close();
	}
}

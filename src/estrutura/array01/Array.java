package estrutura.array01;

import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = scan.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("%.2f", avg);
		
		scan.close();
	}

}

package arrayMatriz01.application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a dimensão da matriz? ");
		int count = scan.nextInt();
		int negative = 0;
		
		int[][] matriz = new int[count][count];
		
		for(int i=0; i<matriz.length; i++) {
			for(int y=0; y<matriz[i].length; y++) {
				matriz[i][y] = scan.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for(int i=0; i<matriz.length; i++){
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println("");
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					negative++;
				}
			}
		}
		
		System.out.println("Números negativos = " + negative);
		
		scan.close();
	}

}

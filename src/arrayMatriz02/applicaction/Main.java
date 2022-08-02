package arrayMatriz02.applicaction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as dimensões da matriz: ");
		int line = scan.nextInt();
		int column = scan.nextInt();
		
		int[][] matriz = new int[line][column];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Digite o número para saber a ocorrencia na matriz: ");
		int position = scan.nextInt();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == position) {
					System.out.println("Posição: " + i + " " + j);
					
					if(j > 0) {
						System.out.println("Esquerda: " +  matriz[i][j-1] );
					}
					if(j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1] );
					}
					if(i > 0) {
						System.out.println("Acima: " + matriz[i-1][j] );
					}
					if(i < matriz.length-1) {
						System.out.println("abaixo: " + matriz[i+1][j] );
					}
				}
			}
		}
		
		
		scan.close();
	}

}

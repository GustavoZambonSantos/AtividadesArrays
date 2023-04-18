package ArraysVetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float [] media = new float [10]; 
		float [][] numeros = new float [10][4];
		int linha, coluna;
		
		for(linha=0;linha<10;linha++) {
			for(coluna=0;coluna<4;coluna++) {
				System.out.println("\nEntre com um numero: ");
				numeros[linha][coluna]= ler.nextInt();

	}

}

	}
}

package ArraysVetoresMatrizes;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [][] numeros = new int [3][3];
		int linha, coluna;
		int somaelementosP=0,somaelementosS=0;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um numero: ");
				numeros[linha][coluna]= ler.nextInt();
				somaelementosP = (numeros[0][0]+numeros[1][1]+numeros[2][2]);
				somaelementosS = (numeros [0][2]+numeros[1][1]+numeros[2][0]);
				
		
			}
			}
		System.out.println("\nElementos da Diagonal Principal: "+numeros[0][0]+numeros[1][1]+numeros[2][2]);
		System.out.println("\nElementos da Diagonal Secundária: "+numeros[0][2]+numeros[1][1]+numeros[2][0]);
		System.out.println("\nSoma dos elementos da Diagonal Principal é: "+somaelementosP);
		System.out.println("\nSoma dos elementos da Diagonal Secundária é: "+somaelementosS);
	}

}

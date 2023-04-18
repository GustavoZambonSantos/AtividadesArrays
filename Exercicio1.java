package ArraysVetoresMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int [] numero = {2,5,1,3,4,9,7,8,10,6};
		int pesquisa;
		int posicao=-1;
		int x;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		pesquisa=ler.nextInt();
		
		for(x=0;x < numero.length;x++) {
			if(numero[x] == pesquisa) {
				posicao = x;
				
			}
		}      
			if(posicao ==-1) {
				System.out.println("O Número "+pesquisa+" Não foi encontrado");
				
			}
			else {
				System.out.println("O número "+ pesquisa+" está na posição "+posicao);
				
			}
	}
		
		
		
		}
	



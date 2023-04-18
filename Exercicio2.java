package ArraysVetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int soma=0,media=0;
		int pares=0,impares=0;
		int[] numero = new int[10];
		int x;
		
		
		for(x=0;x< numero.length;x++) {
			System.out.println("digite um número");
			numero[x]=ler.nextInt();
			soma+=numero[x];
			media= soma / numero.length;		
		}
		
		System.out.println("\nElementos Pares: ");
		for(x=0;x< numero.length;x++) {
		if(numero[x] %2 ==0) 
		{
			pares = numero[x];
		    
		    System.out.print(pares+" "); 
		
		}
		
	}
		System.out.println("\nElementos impares :");
		for(x=0;x< numero.length;x++) {
			if(numero[x] %2 !=0) 
			{
				impares = numero[x];
			    System.out.print(impares+" "); 
			
			}
			
		
		}
		System.out.println("\nA soma é: "+soma);
		System.out.println("\nA media é: "+media);
	}
}





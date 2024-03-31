package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/* 
		 * * TRABALHO DE POO QR01: FACA UM PROGRAMA QUE RECEBA TRES NOTAS, CALCULE E MOSTRE A MEDIA.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float n3 = sc.nextFloat();
		
		float media = (n1+n2+n3)/3;
		System.out.println("A média das 3 notas é: " + media);
		

	}

}

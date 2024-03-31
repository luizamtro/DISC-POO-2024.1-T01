package br.edu.principal;

import java.util.Scanner;

/*Questão resoslvida 01: Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.*/

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número intero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Insira o segundo número intero: ");
		int n2 = sc.nextInt();
		
		System.out.print("Insira o terceiro número intero: ");
		int n3 = sc.nextInt();
		
		System.out.print("Insira o quarto número intero: ");
		int n4 = sc.nextInt();
		
		int soma = n1 + n2 + n3 + n4;
		System.out.print("Está é a soma dos quatro números: "+soma);
	}

}

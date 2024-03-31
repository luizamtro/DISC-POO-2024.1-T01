package br.edu.principal;

import java.util.Scanner;

/*Questão resolvida QR12: Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.*/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro maior que zero: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Digite o segundo número inteiro maior que zero: ");
		float n2 = sc.nextFloat();
		
		double r1 = Math.pow(n1, n2);
		double r2 = Math.pow(n2, n1);
		
		System.out.println("Este é o resultado do 1° número elevado ao 2° número: "+ r1);
		System.out.println("Este é o resultado do 2° número elevado ao 1° número: "+ r2);


	}

}

package br.edu.principal;

import java.util.Scanner;

/*Questão proposta QP01: Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo.
*/



public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
;		
		System.out.print(" Digite o primeiro número: ");
		float n1 = sc.nextFloat();
		
		System.out.print(" Digite o segundo número: ");
		float n2 = sc.nextFloat();
		
		float n3 = n1 - n2;
		System.out.print("Está é o resultado da subtração do 1° número pelo 2° número: " + n3);
	}

}

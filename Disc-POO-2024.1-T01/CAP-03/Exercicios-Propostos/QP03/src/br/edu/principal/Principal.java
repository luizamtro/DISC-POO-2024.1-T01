package br.edu.principal;

import java.util.Scanner;

/*Questão proposta QP03: Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número pelo
segundo. Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupar
com validações.*/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Digite o segundo número(diferente de zero): ");
		float n2 = sc.nextFloat();
		
		float n3 = n1/n2;
		System.out.print("Esta é a divisão do 1° número pelo 2° número: "+ n3);
		
		
	}

}

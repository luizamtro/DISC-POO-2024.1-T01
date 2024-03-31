package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Questão proposta QP14: Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
		a) a idade dessa pessoa em anos;
		b) a idade dessa pessoa em meses;
		c) a idade dessa pessoa em dias;
		d) a idade dessa pessoa em semanas.
  		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu ano de nascimento? ");
		int ano_nascimento = sc.nextInt();
		
		System.out.print("Diga o ano atual? ");
		int ano_atual = sc.nextInt();
		
		int idade_anos = ano_atual - ano_nascimento;
		int idade_meses = idade_anos * 12;
		int idade_dias = idade_anos * 365;
		int idade_semanas = idade_dias/7;
		
		System.out.println("Esta é sua idade em anos: " + idade_anos);
		System.out.println("Esta é sua idade em meses: " + idade_meses);
		System.out.println("Esta é sua idade em dias(considerando ano de 365 dias): " + idade_dias);
		System.out.println("Esta é sua idade em semanas: " + idade_semanas);
	}

}

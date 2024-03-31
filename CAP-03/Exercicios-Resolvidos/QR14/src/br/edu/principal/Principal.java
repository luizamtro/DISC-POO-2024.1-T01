package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questãop QR14: Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
  		*a) a idade dessa pessoa;
    		*b) quantos anos ela terá em 2050.
  		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		System.out.print("Digite seu ano de nascimento ");
		int anoNascimento = sc.nextInt();
		
		int idadeAtual = anoAtual - anoNascimento;
		int idade2050 = 2050 - anoNascimento;
		
		System.out.println("Esta é sua idade atual ou será sua idade neste ano: "+ idadeAtual);
		System.out.println("Esta é sua idade em 2050: "+ idade2050);
	}

}

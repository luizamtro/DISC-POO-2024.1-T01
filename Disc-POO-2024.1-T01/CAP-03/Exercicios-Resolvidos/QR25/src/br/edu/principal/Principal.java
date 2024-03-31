package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/* Questão QR25: Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo.
		Esse programa deverá calcular e mostrar a quantidade de convites que devem ser vendidos para que,
		pelo menos, o custo do espetáculo seja alcançado.*/
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Qual será o custo do espetáculo teatral?: ");
		float custo_teatral = sc.nextFloat();
		
		System.out.print("Qual será o custo do convite?: ");
		float convite = sc.nextFloat();
		
		float qntd_convites = custo_teatral / convite;
		int qntd_convitesInt = (int)qntd_convites;
		
		if(qntd_convites > qntd_convitesInt) {
			qntd_convitesInt++;
			System.out.println("Esta é a quantidade de convites a serem vendidos para arcar: "
		+ qntd_convitesInt);
			
		}
		else if (qntd_convites == qntd_convitesInt) {
			System.out.println("Esta é a quantidade de convites a serem vendidos para arcar: "
					+ qntd_convitesInt);
		}
	
	}

}

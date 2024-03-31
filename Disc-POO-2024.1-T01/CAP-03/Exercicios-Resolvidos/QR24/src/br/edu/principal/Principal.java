package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Questão QR24: Faça um programa que receba uma hora formada por hora e minutos (um número real), calcule e
		mostre a hora digitada apenas em minutos. Lembre-se de que:
		■■ para quatro e meia, deve-se digitar 4.30;
		■■ os minutos vão de 0 a 59.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma hora(Exemplo: quatro e meia = 4,30 ): ");
		float hora_digitada = sc.nextFloat();
		
		int horas = (int)hora_digitada;
		float minutosF = hora_digitada - horas;
		float minutos_totalF = (horas * 60) + (minutosF * 100);
		int minutos_totalInt = (int)minutos_totalF;
		
		System.out.println("Este é o total de minutos: "+ minutos_totalInt);
	}

}

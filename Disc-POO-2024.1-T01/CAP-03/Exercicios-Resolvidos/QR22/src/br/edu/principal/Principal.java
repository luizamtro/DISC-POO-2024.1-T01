package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Questão QR22: Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que rece-
		ba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência. Calcule e mostre:
		a) o valor de cada quilowatt;
		b) o valor a ser pago por essa residência;
		c) o valor a ser pago com desconto de 15%.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quual o valor do salário mínimo? ");
		float salario = sc.nextFloat();
		
		System.out.print("Quual a quantidade de quilowatts? ");
		int qntd_kw = sc.nextInt();
		
		float valor_kw = salario /5;
		float valor_totalkw = valor_kw * qntd_kw;
		float desconto = valor_totalkw * 15/100;
		float valor_total = valor_totalkw - desconto;
		
		System.out.println("Este é o valor do quilowatt: R$"+ valor_kw);
		System.out.println("Este é o valor total da quantidade de quilowatts: R$"+ valor_totalkw);
		System.out.println("Este é o valor total a ser pago: R$"+ valor_total);
	}

}

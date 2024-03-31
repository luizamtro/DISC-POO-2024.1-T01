package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Questão QR17: Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse trabalhador emitiu dois
		cheques e agora deseja saber seu saldo atual. Sabe-se que cada operação bancária de retirada paga
		CPMF de 0,38% e o saldo inicial da conta está zerado.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		float deposito, cheque1, cheque2, cpmf1, cpmf2, saldo;
		
		System.out.print("Qual o valor do seu salário depositado? ");
		deposito = sc.nextFloat();
		
		System.out.print("Qual o valor do seu primeiro cheque? ");
		cheque1 = sc.nextFloat();
		System.out.print("Qual o valor do seu segundo cheque? ");
		cheque2 = sc.nextFloat();
		
		cpmf1 = cheque1 * 0.38F / 100;
		cpmf2 = cheque2 * 0.38F / 100;
		
		saldo = deposito - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.print("Este é o seu saldo de agora: R$" + saldo);
	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão QR07: Faça um programa que receba o salário base de um funcionário, calcule e mostre seu salário a receber, 
  		sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base.*/	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dgite seu salário base: ");
		float salario = sc.nextFloat();
		
		float imposto = salario * 10/100;
		float salarioReceber = salario + 50 - imposto;
		
		System.out.print("Este é o salário que você receberá(gratificação de R$50): "+ salarioReceber);
		
	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Questão QR16: Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e
		mostre o salário a receber, seguindo estas regras:
		a) a hora trabalhada vale a metade do salário mínimo.
		b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada.
		c) o imposto equivale a 3% do salário bruto.
		d) o salário a receber equivale ao salário bruto menos o imposto.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		float horas_trabalhadas, valor_salario_minimo,valor_horas_trabalhadas,
		valor_salario_bruto, imposto, valor_salario_liquido;
		
		//Declarando variáveis
		
		System.out.print("Qual o número de horas trabalhadas? ");
		horas_trabalhadas = sc.nextInt();
		
		System.out.print("Qual o valor do salário mínimo? ");
		valor_salario_minimo = sc.nextInt();
		
		valor_horas_trabalhadas = valor_salario_minimo/2;
		valor_salario_bruto = valor_horas_trabalhadas * horas_trabalhadas;
		imposto = valor_salario_bruto * 3/100  ;
		valor_salario_liquido = valor_salario_bruto - imposto;
		
		System.out.print("Este é o valor do salário líquido: R$"+ valor_salario_liquido );
		
		
		
	}

}

package br.edu.principal;

import java.util.Scanner;

/*Questão proposta QP08: Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas.*/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual você pesa em kilos?: ");
		float pesokg = sc.nextFloat();
		
		float pesogramas = pesokg*1000;
		System.out.print("Este é seu peso em gramas: "+ pesogramas +"g");

	}

}

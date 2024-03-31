package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Questão QR20: Faça um programa que receba a medida do ângulo (em graus) formado por uma escada apoiada no
		chão e encostada na parede e a altura da parede onde está a ponta da escada. Calcule e mostre a me-
		dida dessa escada.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a altura da parede? ");
		float altura = sc.nextFloat();
		
		System.out.print("Qual o valor do ângulo formado? ");
		int angulo = sc.nextInt();
		
		double radiano = angulo * Math.PI / 180;
		double escada = altura / Math.sin(radiano);
		
		float escada2 = (float)escada;
		
		System.out.print("Esta é a altura da escada: "+ escada2);
	}

}

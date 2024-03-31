package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Questão proposta QP20: Faça um programa que receba a medida do ângulo formado por uma escada apoiada no chão e a dis-
		tância em que a escada está da parede, calcule e mostre a medida da escada para que se possa alcançar
		sua ponta.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o valor do ângulo formado entre a escada e a parede? ");
		int angulo = sc.nextInt();
		
		System.out.print("Qual é o valor da distância até a parede? ");
		float distancia = sc.nextFloat();
		
		double graus_radianos = angulo * Math.PI / 180;
		double medida_escada = distancia/ Math.cos(graus_radianos);
		float medida_escada2 = (float)medida_escada;
		
		System.out.print("Esta é a medida da escada: "+ medida_escada2);
		
	}

}

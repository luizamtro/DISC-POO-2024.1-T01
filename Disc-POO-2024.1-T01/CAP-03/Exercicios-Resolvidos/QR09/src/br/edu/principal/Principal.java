package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão QR09: Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base * altura)/2.*/
		
		float base, altura, area;
		
		Scanner entrada;
		
		entrada = new Scanner(System.in);
		
		System.out.print("Digite a base do triangulo:");
		
		base = entrada.nextFloat();
		
		System.out.println("Digite a altura do triangulo:");
		
		altura = entrada.nextFloat();
		
		area = (base*altura)/2;
		
		System.out.println("Area do triangulo = "+area);


	}

}

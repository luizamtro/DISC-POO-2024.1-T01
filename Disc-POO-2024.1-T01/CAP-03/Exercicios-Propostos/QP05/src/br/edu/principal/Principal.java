/*05P. Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se
que este sofreu um desconto de 10%.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);


	    float preço_prod, desconto, preço_final;

	        System.out.println("Digite o preço do produto: ");
	        preço_prod = sc.nextFloat();

	        desconto = preço_prod / 10;
	        System.out.println("O valor do desconto de 10% do produto é: " + desconto);

	        preço_final = preço_prod - desconto;
	        System.out.println("O preço final do produto é: " + preço_final);

	        sc.close();

	}

}

/* QP11. Faça um programa que calcule e mostre a área de um losango. Sabe-se que: A = (diagonal maior * dia-
		gonal menor)/2.8*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);


	       float área_losang, diag_maior, diag_menor;


	       System.out.println("Digite a diagonal maior do losango: ");
	       diag_maior = sc.nextFloat();

	       System.out.println("Digite a diagonal menor do losango: ");
	       diag_menor = sc.nextFloat();

	       área_losang = (diag_maior * diag_menor)/2;
	         System.out.println("A área do losango é: " + área_losang);

	         sc.close();

	}
}

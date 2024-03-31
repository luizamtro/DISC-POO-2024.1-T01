/*QR13. Sabe-se que: 
pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1,760 jarda
Faça um programa que receba uma medida em pés, faça as conversões a seguir e mostre os resultados.
a) polegadas;
b) jardas;
c) milhas.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);

	     float pes, polegadas, jardas, milhas;

	        System.out.println("Digite o valor em pés: ");
	        pes = sc.nextFloat();

	        polegadas = pes * 12;
	        jardas = pes / 3;
	        milhas = jardas / 1760;

	        System.out.println("O valor em polegadas é: " + polegadas);
	        System.out.println("O valor em jardas é: " + jardas);
	        System.out.println("O valor em milhas é: " + milhas);

	        sc.close();

	}

}

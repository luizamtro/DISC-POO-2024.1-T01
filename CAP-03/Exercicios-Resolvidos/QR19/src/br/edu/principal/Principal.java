/*QR19. Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e a altura que 
o usuário deseja alcançar subindo a escada, calcule e mostre quantos degraus ele deverá subir para
atingir seu objetivo, sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem
estar em metros.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    Double a_degrau, a_usuario, qtd_degraus;

	      System.out.println("Digite a altura do degrau: ");
	      a_degrau = sc.nextDouble();

	      System.out.println("Digite a altura que você deseja alcançar: ");
	      a_usuario = sc.nextDouble();

	      qtd_degraus = a_usuario / a_degrau;
	      System.out.println("A quantidade de degraus que você precisa subir é: " + qtd_degraus);

	      sc.close();

	}

}

/*05R. Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre
o valor do aumento e o novo salário.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);

	    Double salario, novoSalario, aumento, percentual;

	      System.out.println("Digite o salário: ");
	      salario = sc.nextDouble();
	      System.out.println("Digite o percentual de aumento: ");
	      percentual = sc.nextDouble();

	      aumento = salario * percentual/100;
	      System.out.print("O aumento é de: " + aumento);

	      novoSalario = salario + aumento;
	      System.out.print("O novo salário é: " + novoSalario);

	      sc.close();

	}

}

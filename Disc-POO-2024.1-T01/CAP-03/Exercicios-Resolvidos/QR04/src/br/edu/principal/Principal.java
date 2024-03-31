package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	     Double salario, novoSalario;
	     String nome;

	      System.out.println("Digite o seu nome: ");
	      nome = sc.nextLine();

	      System.out.println ("Digite o seu salário: ");
	      salario = sc.nextDouble();

	      novoSalario = salario + (salario * 25/100);
	      System.out.println ("Olá " + nome + ", você recebeu um aumento de 25%. O seu novo salário é: " + novoSalario);

	      sc.close();

	}

}

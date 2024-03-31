package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * Questão 23: Receber um número real e mostrar sua parte inteira, parte
		 * fracionária e o arredondamento
		 */

		// Solicitando um número real ao usuário
		System.out.print("Digite um número real: ");
		double numero = scanner.nextDouble();

		// Calculando e exibindo a parte inteira do número
		int parteInteira = (int) numero;
		System.out.println("a) A parte inteira do número é: " + parteInteira);

		// Calculando e exibindo a parte fracionária do número
		double parteFracionaria = numero - parteInteira;
		System.out.println("b) A parte fracionária do número é: " + parteFracionaria);

		// Realizando o arredondamento do número
		long arredondamento = Math.round(numero);
		System.out.println("c) O arredondamento do número é: " + arredondamento);

		scanner.close();
	}
}

package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        /* 
	        Exercício proposto 16) Faça um programa que receba o valor dos catetos de um triângulo, 
	        calcule e mostre o valor da hipotenusa.
	        */
	        
	        // Solicita o valor do primeiro cateto
	        System.out.print("Digite o valor do primeiro cateto: ");
	        double cateto1 = scanner.nextDouble();
	        
	        // Solicita o valor do segundo cateto
	        System.out.print("Digite o valor do segundo cateto: ");
	        double cateto2 = scanner.nextDouble();
	        
	        // Calcula a hipotenusa usando o teorema de Pitágoras: h² = a² + b²
	        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	        
	        // Exibe o valor da hipotenusa
	        System.out.println("O valor da hipotenusa é: " + hipotenusa);
	        
	        scanner.close();

	}

}

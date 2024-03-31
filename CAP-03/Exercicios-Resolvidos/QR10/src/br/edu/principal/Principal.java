package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        /* 
	        10) Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: Área = pi * R^2.
	        */
	        
	        // Constante pi
	        final double PI = 3.14159;
	        
	        // Solicita o raio do círculo
	        System.out.print("Digite o raio do círculo: ");
	        double raio = scanner.nextDouble();
	        
	        // Calcula a área do círculo
	        double area = PI * Math.pow(raio, 2);
	        
	        // Exibe a área do círculo
	        System.out.println("A área do círculo é: " + area);
	        
	        scanner.close();

	}

}

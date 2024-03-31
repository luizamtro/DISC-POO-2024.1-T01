package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        /* 
	        15) O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do
	        distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de fá-
	        brica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre:
	        a) o valor correspondente ao lucro do distribuidor; 
	        b) o valor correspondente aos impostos; 
	        c) o preço final do veículo.
	        */
	        
	        // Solicita o preço de fábrica do veículo
	        System.out.print("Digite o preço de fábrica do veículo: ");
	        double precoFabrica = scanner.nextDouble();
	        
	        // Solicita o percentual de lucro do distribuidor
	        System.out.print("Digite o percentual de lucro do distribuidor (%): ");
	        double percentualLucro = scanner.nextDouble();
	        
	        // Solicita o percentual de impostos
	        System.out.print("Digite o percentual de impostos (%): ");
	        double percentualImpostos = scanner.nextDouble();
	        
	        // Calcula o valor correspondente ao lucro do distribuidor
	        double lucroDistribuidor = precoFabrica * (percentualLucro / 100);
	        System.out.println("a) O valor correspondente ao lucro do distribuidor é: R$" + lucroDistribuidor);
	        
	        // Calcula o valor correspondente aos impostos
	        double impostos = precoFabrica * (percentualImpostos / 100);
	        System.out.println("b) O valor correspondente aos impostos é: R$" + impostos);
	        
	        // Calcula o preço final do veículo
	        double precoFinal = precoFabrica + lucroDistribuidor + impostos;
	        System.out.println("c) O preço final do veículo é: R$" + precoFinal);
	        
	        scanner.close();

	}

}

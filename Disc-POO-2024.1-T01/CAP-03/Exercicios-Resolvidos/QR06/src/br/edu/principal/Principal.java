package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        /* 
	        6) Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
	        sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% também sobre o salário base.
	        */
	        
	        // Solicita o salário base do funcionário
	        System.out.print("Digite o salário base do funcionário: ");
	        double salarioBase = scanner.nextDouble();
	        
	        // Calcula a gratificação do funcionário (5% sobre o salário base)
	        double gratificacao = salarioBase * 0.05;
	        
	        // Calcula o imposto a ser pago pelo funcionário (7% sobre o salário base)
	        double imposto = salarioBase * 0.07;
	        
	        // Calcula o salário a receber (salário base + gratificação - imposto)
	        double salarioReceber = salarioBase + gratificacao - imposto;
	        
	        // Exibe o salário a receber
	        System.out.println("O salário a receber é: R$" + salarioReceber);
	        
	        scanner.close();	

	}

}

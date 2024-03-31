package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        /* 
        18) Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para os quais fornece a
        quantidade de ração em gramas. A quantidade diária de ração fornecida para cada gato é sempre a mesma.
        Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para cada gato,
        calcule e mostre quanto restará de ração no saco após cinco dias.
        */

        // Solicita o peso do saco de ração em quilos
        System.out.print("Digite o peso do saco de ração em quilos: ");
        double pesoRacaoQuilos = scanner.nextDouble();

        // Solicita a quantidade de ração fornecida para cada gato em gramas
        System.out.print("Digite a quantidade de ração fornecida para cada gato em gramas: ");
        double quantidadeRacaoGatos = scanner.nextDouble();

        // Calcula a quantidade total de ração fornecida por dia
        double quantidadeTotalDiaria = quantidadeRacaoGatos * 2; // Dois gatos

        // Calcula o peso restante do saco de ração após cinco dias
        double pesoRestante = pesoRacaoQuilos * 1000 - (quantidadeTotalDiaria * 5); // Convertendo quilos para gramas

        // Exibe o peso restante do saco de ração
        System.out.println("Após cinco dias, restarão " + pesoRestante + " gramas de ração no saco.");

        scanner.close();
    }
}

	

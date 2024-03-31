package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        /* 
        Exercício proposto 24) Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui.
        Ela vai passar por vários países e precisa converter seu dinheiro em dólares, marco alemão e libra esterlina.
        Sabe-se que a cotação do dólar é de R$ 1,80; do marco alemão, de R$ 2,00; e da libra esterlina, de R$ 3,57.
        O programa deve fazer as conversões e mostrá-las.
        */
        
        // Solicita a quantidade de dinheiro em reais
        System.out.print("Digite a quantidade de dinheiro em reais que você possui: R$");
        double dinheiroReais = scanner.nextDouble();
        
        // Define as cotações das moedas em relação ao real
        double cotacaoDolar = 1.80;
        double cotacaoMarcoAlemao = 2.00;
        double cotacaoLibraEsterlina = 3.57;
        
        // Realiza as conversões
        double dinheiroDolar = dinheiroReais / cotacaoDolar;
        double dinheiroMarcoAlemao = dinheiroReais / cotacaoMarcoAlemao;
        double dinheiroLibraEsterlina = dinheiroReais / cotacaoLibraEsterlina;
        
        // Exibe os resultados das conversões
        System.out.println("Com R$" + dinheiroReais + " você terá:");
        System.out.println("- $" + dinheiroDolar + " dólares");
        System.out.println("- " + dinheiroMarcoAlemao + " marcos alemães");
        System.out.println("- £" + dinheiroLibraEsterlina + " libras esterlinas");
        
        scanner.close();

	}

}

package br.edu.principal;
import java.util.Scanner;
public class Principal {
//QUESTÃO RESOLVIDA 03 - CAP. 3
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite o peso da primeira nota: ");
		float peso1 = sc.nextFloat();
		//declarando e lendo primeira nota e peso
		
		System.out.println("Digite a sua segunda nota: ");
		float nota2 = sc.nextFloat();
		System.out.println("Digite o peso da segunda nota: ");
		float peso2 = sc.nextFloat();
		//declarando e lendo segunda nota e peso
		
		System.out.println("Digite a sua terceira nota: ");
		float nota3 = sc.nextFloat();
		System.out.println("Digite o peso da terceira nota: ");
		float peso3 = sc.nextFloat();
		//declarando e lendo terceira nota e peso
		
		float mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
		System.out.print("Esta é a média ponderada das suas notas: "+ mediaPonderada);
		
	}

}

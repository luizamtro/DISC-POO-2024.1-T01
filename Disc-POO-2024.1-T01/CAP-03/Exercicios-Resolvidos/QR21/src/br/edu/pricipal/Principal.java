package br.edu.pricipal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        /* 
        21) Uma pessoa deseja pregar um quadro em uma parede. Faça um programa para calcular e mostrar a
        que distância a escada deve estar da parede. A pessoa deve fornecer o tamanho da escada e a altura em
        que deseja pregar o quadro. Lembre-se de que o tamanho da escada deve ser maior que a altura que se deseja alcançar.
        */

        // Solicita o tamanho da escada
        System.out.print("Digite o tamanho da escada: ");
        double tamanhoEscada = scanner.nextDouble();

        // Solicita a altura em que deseja pregar o quadro
        System.out.print("Digite a altura em que deseja pregar o quadro: ");
        double alturaQuadro = scanner.nextDouble();

        // Verifica se o tamanho da escada é maior que a altura desejada
        if (tamanhoEscada > alturaQuadro) {
            // Calcula a distância entre a escada e a parede usando o teorema de Pitágoras
            double distancia = Math.sqrt(Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2));
            System.out.println("A escada deve estar a uma distância de " + distancia + " metros da parede.");
        } else {
            System.out.println("O tamanho da escada deve ser maior que a altura desejada.");
        }

        scanner.close();
    }
}

	
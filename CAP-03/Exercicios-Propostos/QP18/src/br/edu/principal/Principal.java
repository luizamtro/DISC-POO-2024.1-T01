/*18. Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em
Fahrenheit. Sabe-se que F = 180*(C + 32)/100.*?*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    Float C;
    Float F;

    System.out.println ("Digite a temperatura em celcius: ");
    C = sc.nextFloat();

    F = 180*(C + 32)/100;
    System.out.println ("A temperatura em Fahrenheit é: " + F);

    sc.close ();
  }

}
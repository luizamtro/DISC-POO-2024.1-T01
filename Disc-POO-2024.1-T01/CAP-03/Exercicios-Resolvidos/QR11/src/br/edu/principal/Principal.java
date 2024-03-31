/*11R. Faça um programa que receba um número positivo e maior que zero, calcule e mostre:
a) o número digitado ao quadrado;
b) o número digitado ao cubo;
c) a raiz quadrada do número digitado;
d) a raiz cúbica do número digitado.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    Double num, quadrado, cubo, r2, r3;
      System.out.println ("Digite um número: ");
      num = sc.nextDouble();
      System.out.println ("O número digitado é: " + num );

      quadrado = num * num;
      cubo = num * num * num;
      r2 = Math.sqrt(num);
      r3 = Math.cbrt(num);


      System.out.println ("O quadrado do número é: " + quadrado);
      System.out.println ("O cubo do número é: " + cubo);
      System.out.println ("A raiz quadrada do número é: " + r2);
      System.out.println ("A raiz cubica do número é: " + r3);

      sc.close();
  }

}

package br.curso_aprenda_java.dia1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args){
        Scanner num1Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:\t");
        double num1 = num1Scanner.nextDouble();

        Scanner num2Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:\t");
        double num2 = num2Scanner.nextDouble();

        double resultado = num1 + num2;
        System.out.println("Resultado:\t"+resultado);

    }
}

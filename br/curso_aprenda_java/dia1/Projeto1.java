package br.curso_aprenda_java.dia1;

import java.util.Scanner;

public class Projeto1 {
    public static void main(String[] args){
        Scanner num1Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:\t");
        int num1 = num1Scanner.nextInt();

        Scanner num2Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:\t");
        int num2 = num2Scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("Resultado:\t"+resultado);

    }
}

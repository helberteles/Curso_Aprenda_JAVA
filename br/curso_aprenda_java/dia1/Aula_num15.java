package br.curso_aprenda_java.dia1;

import java.util.Scanner;

public class Aula_num15 {
    public static void main(String[] args){
        Scanner idadeScanner = new Scanner(System.in);
        System.out.print("Digite a sua idade:\t");
        byte idadeCliente = idadeScanner.nextByte();
        System.out.print(idadeCliente);

    }
}

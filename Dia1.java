import java.util.Scanner; //package (Java.util)

public class Dia1 { //class Main
    public static void main(String[] args) { //method main/function
        double numero1, numero2, resultado;

        Scanner numero1Scanner = new Scanner(System.in);
        Scanner numero2Scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: "); //statements
        numero1 = numero1Scanner.nextDouble();

        System.out.print("Digite o primeiro numero: "); //statements
        numero2 = numero2Scanner.nextDouble();
        resultado = numero1 + numero2;
        System.out.print("O resultado é: " + resultado);

    }
}
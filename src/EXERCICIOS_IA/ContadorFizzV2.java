package EXERCICIOS_IA;

import java.util.Scanner;

public class ContadorFizzV2 {
    public static void main(String[] args) {
        ContadorFizzPrinter contador = new ContadorFizzPrinter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite até qual número quer contar: " );
        int numeroLimite = scanner.nextInt();
        System.out.print("Digite qual o primeiro multiplicador tu quer saber: ");
        int multiplicador1 = scanner.nextInt();
        System.out.print("Digite qual o segundo você quer saber: ");
        int multiplicador2 = scanner.nextInt();

        for (int i = 1; i <= numeroLimite; i++) {
            String resultado = contador.gerarResultado(i, multiplicador1, multiplicador2);
            System.out.println(resultado);
        }
        System.out.println("-------------------------------------");
        System.out.println("Fizz: " + contador.contadorFizz);
        System.out.println("Buzz: " + contador.contadorBuzz);
        System.out.println("FizzBuzz: " + contador.contadorFizzBuzz);
    }
}

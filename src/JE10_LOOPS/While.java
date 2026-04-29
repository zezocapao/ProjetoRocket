package JE10_LOOPS;

import java.util.Random;

public class While {
    static void main(String[] args) {
        //Aula sobre while, ele responde apenas expressoes booleanas basicamente, enquanto for true ele vai continuar rodando!
//        boolean expressao = true;
//        int numero = 0;
//        while (numero < 10) {
//            numero += 1;
//            System.out.println(numero);
//        }

        //
        double mesada = 50.0;

        Random numeroAleatorio = new Random();

        while (mesada >= 0) {
            double valor = numeroAleatorio.nextDouble(20.0);
            String valorFormatado = String.format("%.2f", valor);
            mesada -= valor;
            System.out.println(valorFormatado);
        }
        String mesadaFormatado = String.format("%.2f", mesada);
        System.out.println(mesadaFormatado);
    }
}

package JE10_LOOPS;

import java.util.Random;

public class DoWhile {
    static void main(String[] args) {
        DoWhileMethod metodoAtender = new DoWhileMethod();
        boolean atender = false;
        System.out.println("Discando...");

        do {
            System.out.println("Telefone está tocando... Trim-Trim");
        } while (metodoAtender.tocando());
    }
}

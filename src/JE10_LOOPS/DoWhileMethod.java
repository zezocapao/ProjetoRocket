package JE10_LOOPS;

import java.util.Random;

public class DoWhileMethod {
    boolean atender = false;
    int numeroTentativas = 0;
    public boolean tocando() {
        int discagem = new Random().nextInt(5);
        numeroTentativas++;

        if (discagem == 4) {
            atender = true;
        }
        if (numeroTentativas >= 4) {
            atender = true;
        }
        System.out.println("Atendeu? " + atender);

        return !atender;
    }
}


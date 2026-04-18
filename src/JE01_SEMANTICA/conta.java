package JE01_SEMANTICA;

public class conta {
    double saldo = 10.0;

    public void newSaldo(Double valor) {

        double novosaldo = saldo - valor;
    }

    public void printSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

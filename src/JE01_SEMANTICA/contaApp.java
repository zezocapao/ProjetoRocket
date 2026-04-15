package JE01_SEMANTICA;

public class contaApp {
    public static void main(String[] args) {
        conta conta = new conta();
        conta.printSaldo();
        conta conta2 = new conta();
        conta2.newSaldo(4.0);
        conta.printSaldo();
    }
}

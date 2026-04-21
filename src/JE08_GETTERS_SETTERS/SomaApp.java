package JE08_GETTERS_SETTERS;

public class SomaApp {
    static void main(String[] args) {
        Soma numeros = new Soma();
        numeros.setValor1(2);
        numeros.setValor2(3);

        int somador = numeros.somar();
        System.out.println("Numero1 = " + numeros.getValor1() + " Numero2 = " + numeros.getValor2());
        System.out.println("A soma dos dois numeros é = " + somador);

    }
}

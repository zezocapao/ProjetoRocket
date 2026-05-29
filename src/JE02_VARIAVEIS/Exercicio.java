package JE02_VARIAVEIS;

import java.util.Date;

public class Exercicio {
    static void main(String[] args) {
        String nome = "Jose";
        String address = "Capao da Canoa";
        double salary = 4100.0;
        Date data = new Date();


        System.out.println(String.format("Eu " + nome + " residente do endereco " + address + " confirmo que recebi meu salario de " + salary + " na data de " + data));
    }
}

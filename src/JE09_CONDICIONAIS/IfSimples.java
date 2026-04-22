package JE09_CONDICIONAIS;

public class IfSimples {
    static void main(String[] args) {

//            double saldo = 14.0;
//            double valorSol = 15.0;
//
//            if (saldo >= valorSol) {
//                saldo -= valorSol;
//                System.out.println("Valor do novo saldo = " + saldo);
//            } else {
//                System.out.println("Saldo insuficiente = " + saldo);
//            }
        int nota = 6;

        if (nota >= 7) {

            if(nota >= 9 && nota < 11) {
                System.out.println("Excelente! Sua nota é = " + nota);
            } else {
                System.out.println("Aprovado!");
            }

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}

package JE04_Exercicio;

public class ContaCorrenteApp {
    static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.sacar("87787-8", "0001", 20000);

        ContaCorrente contaCorrente2 = new ContaCorrente();
        contaCorrente2.transferirValorParaOutraConta("99999-8", "0002", 20000);


    }
}

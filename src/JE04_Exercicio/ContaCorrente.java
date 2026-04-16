package JE04_Exercicio;
//METODO CRIADO POR MIM, MAS TEM A CORRECAO NO CONTACORRENTECORRECAO.
public class ContaCorrente {
    final String numeroConta = "87787-8";
    final String numeroAgencia = "0001";
    final String nomeCliente = "Jose Victor";
    final String dataNascimento = "13-10-2006";
    final String numeroOutraConta = "99999-8";
    final String numeroOutraAgencia = "0002";

    public int sacar (String numeroDaConta, String numeroDaAgencia, int valor) {
        int saldoConta = 100000;
        if (numeroDaConta.equals(numeroConta) && numeroDaAgencia.equals(numeroAgencia)) {
            int saldoNovo = saldoConta - valor;
            System.out.println(saldoNovo);
        } else {
            System.out.println("Agencia ou Conta não encontrada.");
        }
        return saldoConta;
    }
    public String transferirValorParaOutraConta(String numeroConta, String numeroAgencia, int valor) {
        int saldoOutraConta = 0;
        if (numeroConta.equals(numeroOutraConta) && numeroAgencia.equals(numeroOutraAgencia)) {
            saldoOutraConta = valor;
            System.out.println(saldoOutraConta);
        }
        return "0";
    }
    public String cancelarConta(String numeroConta, String numeroAgencia) {
        return "0";
    }
    public void consultarSaldo() {
        System.out.println("Saldo atual: ");
        ;
    }
}

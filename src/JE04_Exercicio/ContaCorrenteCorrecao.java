package JE04_Exercicio;

import java.awt.*;
import java.time.LocalDate;

//CORRECAO MAIS OU MENOS, ERA UM PROJETO DE LOGICA SO, NAO PARA REALIZAR TUDO.
public class ContaCorrenteCorrecao {
    final String numeroConta = "87787-8";
    final String numeroAgencia = "0001";
    final String nomeCliente = "Jose Victor";
    //final String dataNascimento = "13-10-2006"; Corrigido para localdate
    LocalDate dataNascimento;
    final String numeroOutraConta = "99999-8";
    final String numeroOutraAgencia = "0002";
    //Adicionado o campo boolean, para representar se a conta vai estar ativa ou cancelada, retornando true or false.
    Boolean ativo = true;

    //Corrigido os tipos, a maioria é void.
    public void sacar (String numeroDaConta, String numeroDaAgencia, int valor) {
        int saldoConta = 100000;
        if (numeroDaConta.equals(numeroConta) && numeroDaAgencia.equals(numeroAgencia)) {
            int saldoNovo = saldoConta - valor;
            System.out.println(saldoNovo);
        } else {
            System.out.println("Agencia ou Conta não encontrada.");
        }
    }
    public void transferirValorParaOutraConta(String numeroConta, String numeroAgencia, int valor) {
        int saldoOutraConta = 0;
        if (numeroConta.equals(numeroOutraConta) && numeroAgencia.equals(numeroOutraAgencia)) {
            saldoOutraConta = valor;
            System.out.println(saldoOutraConta);
        }
    }
    public void cancelarConta(String numeroConta, String numeroAgencia) {
    }
    public void consultarSaldo() {
        System.out.println("Saldo atual: ");
    }
    public List consultarExtrato (LocalDate dataInicial, LocalDate dataFinal) {
        return null;
    }
}

package JE06_METODOS;

import java.util.Date;

//Aqui fala mais sobre como deve ser estruturado os parametros, vou tentar construir um metodo com logica e os outros
// vao ser so para visualizacao.
//Execucao dos metodos é em outro arquivo, possivel MetodosApp.java
public class Metodos {
    public double somar(double n1, double n2) {
        double somatorio = n1 + n2;
        return somatorio;
        //Esse metodo basicamente vai ser chamado pela classe Metodo, pois ele esta dentro da classe, e vamos criar uma instanciacao no outro App colocando os parametros dentro do metodo no outro file.
    }
    public Date dataAtual() {
        Date dataAtual = new Date();
        return dataAtual;
        //Aqui por exemplo estamos criando uma instancia na nossa classe para a classe utilitaria que é o Date, no outro arquivo ele retorna a data Atual.

    }
    public int buscaIdeias(String valor1, String valor2) {
        int valorRandom = Integer.valueOf(valor2);
        int valorRandom2 = Integer.valueOf(valor1);
        int valorTotal = valorRandom + valorRandom2;
        System.out.println(valorTotal);
        return valorTotal;
    }
}

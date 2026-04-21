package JE07_ATRIBUICOES_ARITMETICOS;

public class Atribuicoes {
    static void main(String[] args) {
        String concatenacao = "?";
        //No sentido de concatenacao, o java entende que, sempre apos uma string e um sinal aritmetico, é um sinal de concatenacao, ou seja, sempre que tentar fazer a soma de um numero apos uma String, precisa colocar esse numero em evidencia (Sao os parenteses ()), fora isso, os resultados sempre serao uma concatenacao.
        concatenacao = 1 + 1 + 1 + "1"; //31
        concatenacao = "1" + 1 + 1 + 1;//1111
        concatenacao = 1+  "1"+ 1+ 1;//1111
        concatenacao = "1" + (1+1+1);//13
    }
}

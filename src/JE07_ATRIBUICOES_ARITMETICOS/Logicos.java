package JE07_ATRIBUICOES_ARITMETICOS;

public class Logicos {
    static void main(String[] args) {
        boolean numero1 = true;
        boolean numero2 = false;

        // Os boleanos nas condicionais, sempre vao retornar TRUE, ou seja, se tuas variaveis forem FALSE, e tu quer que retorne TRUE, tu tem que colocar um ! na frente da variavel dentro da condição, se nao, nao vai retornar.
        if (numero1 && !numero2) {
            System.out.println("Nao vai ser true");
        }
        if (!numero1 || numero2) {
            System.out.println("Nao vai ser false");
        }
    }
}

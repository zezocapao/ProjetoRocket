package JE10_LOOPS;

public class For {
    static void main(String[] args) {
        //usando for, é bem legal, ao declarar a variavel (int i = 0;), esse é onde o for começa e ja faz a primeira execução, cada ; indica que o for esta fazendo uma operação, geralmente são 3 operações. A segunda parte do for é geralmente onde é definido onde ele vai PARAR, para nao ficar em LOOP INFINITO, nesse caso é o tamanho do ARRAY em INDICES, enquanto i for menor que o tamanho da lista alunos, vai executando os comandos. E o ultimo bloco é o incremento, pois enquanto i for menor, ele em algum momento tem que ser maior, aí que entra o incremento, todo fim de execucao, ele incrementa.
        String[] alunos = { "Felipe", "Bambos", "Joseph", "Jonas" };

        System.out.println(alunos.length);

        char[] array = {'r','a','d', 'a', 'r'};
        boolean palindromo = true;

        for (int i = 0; i<array.length / 2; i++ ) {

            int indiceFinal = array.length - 1 - i;

            if (array[indiceFinal] != array[i]) {
                palindromo = false;
                break;
            }
        }
        System.out.println(palindromo);

        for (int i=0; i < alunos.length; i++) {
            int numero = i + 1;
            System.out.println(i==0 ? "Aluno" + numero + " = " + alunos[i] : "Alunos" + numero + " = " + alunos[i]);
        }

        //Aqui temos o famoso FOREACH, ele já é próprio para Arrays/Listas/Coleções basicamente, não é igual javascript que tem um for chamado forEach, mas aqui o forEach é dado com os : basicamente, criando uma Variavel String antes : array, não é muito recomendado para ver indices etc.
        for (String aluno: alunos) {
            System.out.println(aluno);
        }
        for(int i = 1; i <= 20; i++) {
            if (i%2 == 0) {
                System.out.println(i + "- Carneirinhos e é par");
                //O continue interrompe a linha/iteração atual do laço for.
                //continue;
            } else {
                if (i == 1) {
                    System.out.println(i + "- Carneirinho e é impar");
                } else {         System.out.println(i + "- Carneirinhos e é impar");
               }
           }
        }
    }
}

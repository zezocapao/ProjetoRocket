package JE05_CONVERSAO_PRIMITIVOS;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //nesse codigo, esta mostrando que podemos converter tipos primitivos para outros tipos primitivos.
        double numeroDouble = 238.8;
        int numeroInt = (int) numeroDouble;
        //System.out.println(numeroInt); //238
        //A linguagem java, permitiu a conversao, mas expulsou o .8, pois o valor virando int, pega apenas oq é antes da vírgula.
        //Talvez um caso para utilizar isso, seria em arredondamentos de valores.

        //Aqui vai ser o mesmo exemplo, porem utilizando as Classes Wrappers.
        //As classes Wrappers, tem metodos embutidos nelas, como o intValue(), que transforma o valor em inteiro.
        Double numeroDouble2 = 238.8;
        Integer numeroInt2 = numeroDouble2.intValue();
        System.out.println(numeroInt2);

        //Aqui e transformando uma string em um valor fracionario com o metodo valueOf da classe Double.
        String numeroString = "238.8";
        Double numeroDouble3 = Double.valueOf(numeroString);
        System.out.println(numeroDouble3);

        //Aqui estou utilizando os metodos da classe Integer como o .equals, e vou deixar comentado outro metodo que é compareTo, que caso o valor comparado seja igual, ele retorna 0, caso o valor comparado seja menor, retorna -1 e se for maior +1.
        Integer numero1 = Integer.valueOf("100");
        Integer numero2 = Integer.valueOf(100);
        System.out.println(numero2.equals(numero1));
        //Aqui abaixo é basicamente utilizando operadores logicos, que tem a mesma funcao do metodo equals.
        //System.out.println(numero2 == numero1);
        System.out.println(numero1.compareTo(numero2));
        //Esse faz a mesma coisa que os operadores logicos tambem, retorna em boolean, porem achei ele mais pratico, é basicamente como se tivesse um =, > e < embutidos nele, lembrando que a funcionalidade é de acordo com o comentário em cima lá.
        //System.out.println(numero1 < numero2);

        //Declarar uma variavel é basicamente uma vez só que acontece no código, exemplo:
        int variavelRandom = 8;
        //Para o java, a ordem importa, entao aqui a variavel esta valendo 8, ela passa valer 9 so apos esse print.
        System.out.println(variavelRandom);//8
        //Ao tentar atribuir um valor novo para a variavel que ja existe, nao se pode usar o tipo dela, pois ela ja tem declarado isso, a maneira abaixo comentada é errada, abaixo da errada vai estar a maneira certa.
        //int variavelRandom = 9;
        variavelRandom = 9;
        System.out.println(variavelRandom); //9


    }
}


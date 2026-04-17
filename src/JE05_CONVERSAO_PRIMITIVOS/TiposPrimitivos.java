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
    }
}


package JE07_ATRIBUICOES_ARITMETICOS;

public class Unarios {
    static void main(String[] args) {
        //Aqui da para tu definir se o valor é negativo ou nao com o atributo aritmetico, + e -, da para fazer direto no print tambem, mas tem regras da matematica como Sinais iguais = Positivo, ou sinais diferentes = Negativo.
        int numero = +5;
        numero = -numero;
        System.out.println(numero);
        System.out.println(-numero);

        //Estamos utilizando um dos atributos unarios, que é o ++ e --, ele automaticamente adiciona +1 a sua variavel, seu uso é a variavel++, como nos exemplos abaixo, muito utilizado nos foor loops, que é algo que tenho bastante dificuldade em entender e em quais situações utilizar.
        int numero2 = 5;
        numero2++;
        System.out.println(numero2); //6

        int numero3 = 5;
        numero3--;
        System.out.println(numero3); //4

        
    }
}

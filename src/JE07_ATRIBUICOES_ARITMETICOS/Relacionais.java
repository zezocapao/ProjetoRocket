package JE07_ATRIBUICOES_ARITMETICOS;

public class Relacionais {
    static void main(String[] args) {
        //classe Operadores.java
        int numero1 = 2;
        int numero2 = 2;
        int idade = 15;
        boolean maiorIdade = idade <= 17;

        if (maiorIdade == true) {
            System.out.println("Menor de idade, idade: " + idade + " anos");
        } else {
            System.out.println("Maior de idade, idade: " + idade + " anos");
        }

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");
        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");
        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");
        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");
        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
    }
}

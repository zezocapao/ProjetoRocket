package JE02_VARIAVEIS;

public class VariaveisAPP {
    public static void main(String[] args) {
        //Para uma variavel ser imutavel (constante ou que nao pode ser alterada), ela deve ser toda MAIUSCULA e conter o "final" antes da tipagem, ex:
        final String BR = "Brasil";

        //Ao tentar alterar, vai ficar red, exemplo vai ficar comentado para o script rodar
        //EX: BR = "EUA";

        //Uma variavel mutavel, é só declarar ela normal, com tipo nomeVariavel = valor, ex:
        int number = 12;
        
        //Caso a variavel IMUTAVEL, seja composta, adicionar os UNDERLINES, ex:
        final String nomeComposto = "Jose Victor";

        //-----------------------------------------------




        System.out.println(BR); //Brasil
        System.out.println(number); //12
        System.out.println(nomeComposto);//Jose Victor

    }
}

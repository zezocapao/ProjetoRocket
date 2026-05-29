package JE09_CONDICIONAIS;

public class SwitchExerciseDevDojo {
    static void main(String[] args) {
        //Imprima com Switch, se e dia util ou nao, considerando 1 como Domingo.
        int day = 3;

        System.out.println(switch (day) {
            default -> "Opcao Invalida";
            case 1,7 -> "Fim de Semana";
            case 2,3,4,5,6 ->"Dia Util";
        });
    }
}
//Utilizei o switch expression, nao conhecia essa estrutura, mas e mt mais interessante e pratica!!

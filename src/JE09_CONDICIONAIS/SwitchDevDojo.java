package JE09_CONDICIONAIS;

public class SwitchDevDojo {
    static void main(String[] args) {
        //Informar dia da semana, sendo Domingo o 1, com SWITCH.
        int day = 3;

        switch (day) {
            default:
                System.out.println("Numero ou Caractere invalido, somente de 1 a 7.");
                break;
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
        }
    }
}

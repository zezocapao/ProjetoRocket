package JE09_CONDICIONAIS;

public class SwitchCase {
    static void main(String[] args) {
        //O switch é executado todas as vezes até existir um BREAK, e a ordem dos fatores importa.
        String casoTeste = "p".toUpperCase();

        switch (casoTeste) {
            case "P" :{
                System.out.println("PEQUENO");
                break;
            }
            case "M" :{
                System.out.println("MÉDIO");
                break;
            }
            case "G" :{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }
    }
}

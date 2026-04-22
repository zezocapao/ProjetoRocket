package JE09_CONDICIONAIS;

public class DesafioSwitchCasePlanoOperadora {
    static void main(String[] args) {
        String planoOperadora = "f".toUpperCase(); //B = Basic, M = Média, T = Turbo

        DesafioSwitchCasePlanoOperadoraApp cases = new DesafioSwitchCasePlanoOperadoraApp();

        switch (planoOperadora) {
            case "B":{
                cases.planoBasic();
                break;
            }
            case "M": {
                cases.planoMedia();
                break;
            }
            case "T": {
                cases.planoTurbo();
                break;
            }
            default:{
                System.out.println("Valor não encontrado.");
            }

        }
    }
}

package EXERCICIOS_IA;


public class ContadorFizzPrinter {
    int contadorFizz = 0;
    int contadorBuzz = 0;
    int contadorFizzBuzz = 0;

    public String gerarResultado (int i, int mult1, int mult2) {
        String resultado = "";

        if (i % mult1 == 0 && i % mult2 == 0 ) {
            resultado += "FizzBuzz";
            contadorFizzBuzz++;
        }
        else if ( i % mult1 == 0 ) {
            resultado += "Fizz";
            contadorFizz++;
        } else if ( i % mult2 == 0 ) {
            resultado += "Buzz";
            contadorBuzz++;
        } else {
            return "Números " + i;
        }
        return resultado  + " " + i;
    }
}

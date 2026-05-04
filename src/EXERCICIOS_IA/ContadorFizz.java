package EXERCICIOS_IA;

//ex1 é basicamente um contador de múltiplos, achei interessante, vamos evoluindo eles em outras classes.
public class ContadorFizz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz " + i);
            }
            else if ( i%3 == 0 ) {
                System.out.println("Fizz " + i);
            }
            else if (i%5 == 0) {
                System.out.println("Buzz " + i);
            }
            else {
                System.out.println("Nem fizz nem buzz " + i);
            }
        }
    }
}

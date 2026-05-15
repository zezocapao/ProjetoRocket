package JE09_CONDICIONAIS;

import java.util.Scanner;

public class DevDojo0502 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque sua idade aqui: ");
        int resposta = scan.nextInt();

        if (resposta < 15) {
            System.out.println("Categoria Infantil");
        } else if (resposta >= 15 && resposta < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulta");
        }
    }
}

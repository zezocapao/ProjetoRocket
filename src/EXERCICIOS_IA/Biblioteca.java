package EXERCICIOS_IA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Livro livros = new Livro();
        livros.nomeLivro = "Harry Potter";
        livros.autorLivro = "J.K Howling";
        livros.qtdPaginas = 1450;
        livros.id = 78506078;

        boolean verLivro = true;

        while (verLivro) {
            System.out.println("Você quer ver os livros disponíveis? [S/N] ");
            String resposta = scan.next().toUpperCase();
            if (resposta.equals("S")) {
                System.out.println("Livro: " + livros.nomeLivro);
                System.out.println("Autor: " + livros.autorLivro);
                System.out.println("Páginas: " + livros.qtdPaginas);
                System.out.println("ID: " + livros.id);

                System.out.println("Você quer alugar algum? [S/N] " );
                String resposta2 = scan.next().toUpperCase();
                if (resposta2.equals("S")) {
                    boolean idTrue = true;
                        while (idTrue) {
                            try {
                            System.out.println("Digite o ID do livro que você deseja: ");
                            int idResposta = scan.nextInt();
                            if (idResposta != livros.id) {
                                System.out.println("Não temos esse ID aqui.");
                            } else {
                                System.out.println("Certo! Parabéns.");
                                idTrue = false;
                                verLivro = false;
                            }
                        } catch (InputMismatchException e) {
                                System.err.println("Número muito grande ou uso de caracteres.");
                                scan.next();
                            }
                    }
                } else {
                    System.out.println("Tudo bem, haverá outras oportunidades. ");
                    verLivro = false;
                }
            } else {
                System.out.println("Até mais! ");
                verLivro = false;
            }
        }
    }
}

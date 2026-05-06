package PROJETOPESSOAL;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        Livro novoLivros = new Livro("Harry Potter", "J.K Howling", 1450, 78506078, true);
        livros.add(novoLivros);

        boolean verLivro = true;

        while (verLivro) {
            System.out.print("Você quer ver os livros disponíveis? [S/N] -> ");
            String resposta = scan.next().toUpperCase();
            if (resposta.equals("S")) {
                System.out.println("\nCatalogo: ");
                for (Livro livro : livros) {
                    System.out.println("\nLivro: " + livro.nomeLivro + "\nAutor: " + livro.autorLivro + "\nPaginas: " + livro.qtdPaginas + "\nID: " +
                            livro.id + "\nDisponivel: " + livro.disponivel + "\n");
                }
                System.out.print("Você quer alugar algum? [S/N] -> " );
                String resposta2 = scan.next().toUpperCase();
                if (resposta2.equals("S")) {
                    boolean idTrue = true;
                        while (idTrue) {
                            try {
                            System.out.print("Digite o ID do livro que você deseja: ");
                            int idResposta = scan.nextInt();
                            if (idResposta != novoLivros.id) {
                                System.out.println("Não temos esse ID aqui.");
                            } else {
                                System.out.println("\nCerto! Parabéns.");
                                idTrue = false;
                                verLivro = false;
                                novoLivros.disponivel = false;
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

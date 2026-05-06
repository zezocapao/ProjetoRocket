package PROJETOPESSOAL;

public class Livro {
    String nomeLivro;
    String autorLivro;
    int qtdPaginas;
    int id;
    boolean disponivel = true;

    public Livro(String nomeLivro, String autorLivro, int qtdPaginas, int id, boolean disponivel) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.qtdPaginas = qtdPaginas;
        this.id = id;
        this.disponivel = disponivel;
    }
}

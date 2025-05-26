package Biblioteca.Publicacao;

public class Livro extends Publicacao{
    private String autor;

    public Livro(String nome, int anoPublicacao, String autor){
        super(nome, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void abrir() {
        System.out.printf("Abrindo o livro <%s> do autor <%s>\n", getTitulo(), autor);
    }

    @Override
    public String toString() {
        return String.format("Livro %s escrito por %s, publicado em %d\n", getTitulo(), autor, getAnoPublicacao());
    }
}

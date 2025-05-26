package Biblioteca.Publicacao;

public class Revista extends Publicacao{
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return String.format("Revista %s publicada em %d. %d edicao.\n", getTitulo(), getAnoPublicacao(), edicao);
    }

    @Override
    public void abrir() {
        System.out.printf("Lendo a revista <%s>, edicao <%d>\n", getTitulo(), edicao);
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
    
}

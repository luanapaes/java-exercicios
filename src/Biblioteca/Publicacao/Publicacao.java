package Biblioteca.Publicacao;

public class Publicacao {
    private String titulo;
    private int anoPublicacao;

    public Publicacao(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return String.format("%s - %d\n", titulo, anoPublicacao);
    }

    public void abrir(){
        System.out.println("Abrindo publicação genérica");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

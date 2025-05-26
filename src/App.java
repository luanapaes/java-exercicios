import Biblioteca.Publicacao.*;
import Biblioteca.*;
public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("A Culpa e das Estrelas", 2012, "John Green");
        Livro livro2 = new Livro("A Biblioteca da Meia-Noite", 2020, "Mat Haig");

        Revista revista1 = new Revista("Cultura Pernambucana", 2025, 3);
        Revista revista2 = new Revista("Caminhos da Arte", 2023, 2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarPublicacao(livro1);
        biblioteca.adicionarPublicacao(livro2);
        biblioteca.adicionarPublicacao(revista1);
        biblioteca.adicionarPublicacao(revista2);
        biblioteca.listarPublicacoes();
        biblioteca.buscarPorTitulo("");
        biblioteca.abrirTodasPublicacoes();
    }
}
 
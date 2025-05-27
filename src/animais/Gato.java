package animais;

public class Gato extends Animal{
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s miou\n", getNome());
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - Idade: %d anos - Cor: %s\n", getNome(), getIdade(), cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

package animais;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s latiu\n", getNome());
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - Idade: %d anos - Raca: %s\n", getNome(), getIdade(), raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

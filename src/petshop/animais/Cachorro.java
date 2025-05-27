package petshop.animais;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String tipoAlimentacao) {
        super(nome, idade, tipoAlimentacao);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
    
}

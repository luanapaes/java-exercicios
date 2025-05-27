package petshop.animais;

public class Papagaio extends Animal{

    public Papagaio(String nome, int idade, String tipoAlimentacao) {
        super(nome, idade, tipoAlimentacao);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Curupaco!");
    }
}

package animais;

public class Passaro extends Animal{
    private boolean voa;

    public Passaro(String nome, int idade, boolean voa){
        super(nome, idade);
        this.voa = voa;
    }

    @Override
    public String toString() {
        if(voa){
            return String.format("Nome: %s - Idade: %d anos - Voa\n", getNome(), getIdade());
        } else{
            return String.format("Nome: %s - Idade: %d anos - Nao voa\n", getNome(), getIdade());
        } 
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s cantou bem-ti-vi\n", getNome());
    }

}

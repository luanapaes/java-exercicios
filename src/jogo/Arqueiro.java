package jogo;

public class Arqueiro extends Persona{
    private String arma;
    
    public Arqueiro(String nome){
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString() {
        String informacoes = super.toString();
        String informacoesArqueiro = String.format(" - Arma: %s", arma);
        return informacoes + informacoesArqueiro;
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro atacou com " + arma);
    }
}

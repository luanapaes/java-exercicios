package devflix;

public class Filme extends Video{
    private String audio;
    private String legenda;

   public Filme(String nome){
    super(nome);
    this.audio = "Portugues";
    this.legenda = "Nenhuma";
   }

    @Override
    public void play() {
        System.out.printf("Iniciando filme %s...\n", getNome());
    }

    public void play(String audio){
        System.out.printf("Play: ", toString());
        this.audio = audio;
    }
    
    @Override
    public String toString() {
        return String.format("%s (audio %s - legenda %s)", getNome(), this.audio, this.legenda);
    }
}

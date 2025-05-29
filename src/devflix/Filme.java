package devflix;

public class Filme extends Video {
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "portugues";
        this.legenda = "nenhuma";
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    @Override
    public void play() {
        System.out.printf("Iniciando filme %s...\n", getNome());
    }

    @Override
    public String toString() {
        return String.format("%s (audio %s - legenda %s)", getNome(), this.audio, this.legenda);
    }

    public void play(String audio) {
        this.audio = audio;

        if (audio == "portugues") {
            this.legenda = "nenhuma";
        } else {
            this.legenda = "portuges";
        }

        System.out.println("Play: " + toString());
    }

    public void play(String audio, String legenda) {
        if (audio != "" && legenda != "") {
            this.audio = audio;
            this.legenda = legenda;
            System.out.println("Play: " + toString());
        } else if (audio == "" || legenda == "") {
            System.out.println("Por favor, informe sua preferencia de audio e legenda.");
        } else {
            System.out.println("Informe suas preferencias de audio e legenda");
        }
    }
}

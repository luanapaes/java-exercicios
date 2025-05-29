package devflix;

public class Serie extends Filme {
    private int temporadas;
    private int episodiosPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemporada, int temporadaAtual, int episodioAtual) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    @Override
    public String toString() {
        return String.format("%s %dx%02d (audio %s - legenda %s)", getNome(), temporadaAtual, episodioAtual, getAudio(),
                getLegenda());
    }

    public void play(int temporada, int episodio) {
        if(validarEpisodio(temporada, episodio)){
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Episodio invalido!");
        }
    }

    private boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0)
            return false;
        
        if(temporada > temporadas || episodio > episodiosPorTemporada)
            return false;
             
        return true;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }
}

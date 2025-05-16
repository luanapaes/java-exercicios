import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    String[] habilidades;


    public void exibirInformacoes(){
        System.out.format("Personagem: %s <level %d> com %d de forca\n", nome, nivel, forca);
    }

    public int calcularDano(){
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    public void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if(habilidade.length() == 0){
            System.out.format("%s atacaou %s e causou %d de dano.\n", nome, alvo, forca);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
        }
    }

    public void verificarHabilidades(){
        for(int i = 0; i < habilidades.length; i++){
            System.out.format("Habilidade: %s\n", habilidades[i]);
        }
    }
}

package classes;

public class Usuario {
    public String nome;
    public int idade;
    public float altura;

    public Usuario(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void mostrarInformacoes(){
        System.out.println(nome + " tem " + idade + " anos" + " e " + altura + " de altura.");
    } 
}

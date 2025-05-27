package petshop.animais;

import petshop.animais.interfaces.Comportamento;

public abstract class Animal implements Comportamento{
    private String nome;
    private int idade;
    private String tipoAlimentacao;

    public Animal(String nome, int idade, String tipoAlimentacao){
        this.nome = nome;
        this.idade = idade;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public void mostrarInfo(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Tipo de Alimento: %s\n", tipoAlimentacao);
        emitirSom();
        System.out.println("");
    }

    @Override
    public abstract void emitirSom();

    @Override
    public String toString() {
        return String.format("Nome: %s - Idade: %d - Tipo de Alimento: %s", nome, idade, tipoAlimentacao);
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

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimetacao) {
        this.tipoAlimentacao = tipoAlimetacao;
    }

}

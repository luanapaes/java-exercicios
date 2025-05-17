public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int qtdProduto){
        this.quantidade = qtdProduto;
    }

    public void exibirInformacoes(){
        System.out.println(nome + " -- R$" + preco + " -- " + quantidade + " unidades em estoque");
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        if(quantidade > this.quantidade){
            System.out.format("Nao e possivel remover %d produtos pois nao ha essa quantidade disponivel no estoque.\n", quantidade);
        } else{
            this.quantidade -= quantidade;
        }
    }


}

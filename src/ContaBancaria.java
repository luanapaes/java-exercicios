public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void exibirInformacoes(){
        System.out.println("--- INFORMACOES DA CONTA ---");
        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo R$" + saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Nao ha saldo suficiente em sua conta.");
        } else{
            saldo -= valor;
        }
    }
}

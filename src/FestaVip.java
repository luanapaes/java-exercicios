public class FestaVip {

    private int qtdCafe = 100;
    private int qtdSalgados = 250;
    

    void entrar(){
        beberCafe();
        comerSalgado();
    }

    private void beberCafe(){
        qtdCafe--;
        System.out.println("Bebeu 1 xicara de cafe.");
    }

    private void comerSalgado(){
        qtdSalgados--;
        System.out.println("Comeu 5 salgados.");
    }
}

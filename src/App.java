public class App {
    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular();

        celularA.nome = "Iphone 12";
        celularA.sistemaOperacional = "iOS";
        celularA.espacoArmazenamento = 128;
        celularA.tamanhoTela = 6.1f;

        Celular celularB = new Celular();

        celularB.nome = "Galaxy A51";
        celularB.sistemaOperacional = "Android";
        celularB.espacoArmazenamento = 128;
        celularB.tamanhoTela = 6.5f;

        System.out.println("------------------------------------------------");
        System.out.format("Celular %s com tela de %.1f, com %dgb de memória e SO %s \n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb de memória e SO %s", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
    }
}

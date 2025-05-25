import animais.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro dog = new Cachorro("Espiga", 3, "Vira-Lata");
        dog.emitirSom();
        Gato cat = new Gato("Miguel", 1, "Amarelo");
        cat.emitirSom();
        Passaro fly = new Passaro("Bem-Ti-Vi", 4, false);
        System.out.print(fly);

        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(cat);
        zoo.adicionarAnimal(dog);
        zoo.adicionarAnimal(fly);
        zoo.listarAnimais();
        zoo.emitirSons();

        zoo.buscarAnimalPorNome("Oliva");
    }
}
 
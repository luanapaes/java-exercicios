import petshop.PetShop;
import petshop.animais.Cachorro;
import petshop.animais.Papagaio;

public class App {
    public static void main(String[] args) throws Exception {
        PetShop petshop = new PetShop();

        Cachorro dog1 = new Cachorro("Espiga", 6, "Racao");
        Cachorro dog2 = new Cachorro("Simas", 5, "Racao");

        Papagaio papa1 = new Papagaio("Sorriso", 8, "Sementes");
        Papagaio papa2 = new Papagaio("Brasileiro", 19, "Frutas");
        Papagaio papa3 = new Papagaio("Cantor", 2, "Sementes");

        petshop.add(dog1);
        petshop.add(dog2);
        petshop.add(papa1);
        petshop.add(papa2);
        petshop.add(papa3);

        petshop.listarTodos();
        petshop.listarMaioresDe5Anos();
        petshop.listarPapagaiosQueComemSementes();
    }
}
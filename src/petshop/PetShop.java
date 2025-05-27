package petshop;

import java.util.ArrayList;

import petshop.animais.Animal;
import petshop.animais.Papagaio;

public class PetShop {
    private ArrayList<Animal> animais;

    public PetShop() {
        this.animais = new ArrayList<>();
    }

    public void add(Animal animal) {
        animais.add(animal);
    }

    public void listarTodos() {
        System.out.println("--- Exibindo todos os animais ---");

        for (Animal animal : animais) {
            animal.mostrarInfo();
        }
    }

    public void listarMaioresDe5Anos() {
        System.out.println("--- Maiores de 5 anos ---");

        boolean maiorQue5Anos = false;

        for (Animal animal : animais) {
            if (animal.getIdade() > 5) {
                System.out.format("Animal %s possui mais de 5 anos de idade\n", animal.getNome());
                maiorQue5Anos = true;
            }
        }

        if (!maiorQue5Anos) {
            System.out.println("Nao ha animais com mais de 5 anos cadastrado.");
        }
    }

    public void listarPapagaiosQueComemSementes() {
        System.out.println("");
        System.out.println("--- Se alimentam de sementes ---");

        boolean seAlimentaDeSemente = false;

        for (Animal animal : animais) {
            if (animal instanceof Papagaio && animal.getTipoAlimentacao().equalsIgnoreCase("Sementes")) {
                System.out.printf("O papagaio %s se alimenta de sementes.\n", animal.getNome());
                seAlimentaDeSemente = true;
            }
        }

        if (!seAlimentaDeSemente) {
            System.out.printf("Nao ha papagaios que se alimentam de sementes cadastrados.");
            System.out.println("");
        }
    }
}

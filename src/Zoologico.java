

import java.util.ArrayList;

import animais.Animal;

public class Zoologico {
    // modificador - tipo - nome do atributo
    private ArrayList<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void listarAnimais() {
        System.out.println("--- Animais ---");
        for (Animal animal : animais) {
            System.out.print(animal);
        }
    }

    public void emitirSons() {
        System.out.println("--- Som dos Animais ---");
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }

    public void buscarAnimalPorNome(String nome) {
        System.out.println("Consultando..");

        boolean encontrado = false;

        for (Animal animal : animais) {
            if(animal.getNome().equals(nome)){
                System.out.println("Encontrado: " + animal.getNome());
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.printf("Animal %s nao encontrado", nome);
        }
    }

}

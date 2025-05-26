package Biblioteca;

import java.util.ArrayList;

import Biblioteca.Publicacao.Publicacao;

public class Biblioteca {
    private ArrayList<Publicacao> publicacoes;

    public Biblioteca() {
        this.publicacoes = new ArrayList<>();
    }

    public void adicionarPublicacao(Publicacao p) {
        this.publicacoes.add(p);
    }

    public void listarPublicacoes() {
        System.out.println("---- Publicacoes ----");

        for (Publicacao publicacao : publicacoes) {
            System.out.println(publicacao);
        }
    }

    public void buscarPorTitulo(String titulo) {
        System.out.println("---- Buscando.. ----");

        boolean encontrado = false;

        if (titulo.equals("")) {
            System.out.println("Erro: informe o titulo da revista ou livro.");
        } else {
            for (Publicacao publicacao : publicacoes) {
                if (publicacao.getTitulo().equals(titulo)) {
                    System.out.println(publicacao);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.printf("Publicacao com titulo <%s> nao encontrada.\n", titulo);
            }
        }
    }

    public void abrirTodasPublicacoes() {
        System.out.println("---- Listando publicacoes.. ----");

        for (Publicacao publicacao : publicacoes) {
            publicacao.abrir();
        }
    }
}

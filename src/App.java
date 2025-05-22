import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import classes.*;
import videos.*;

public class App {
    public static void main(String[] args) throws Exception {
        // ---- aula 1 ----------
        // Celular celularA = new Celular();
        // celularA.nome = "Iphone 12";
        // celularA.sistemaOperacional = "iOS";
        // celularA.espacoArmazenamento = 128;
        // celularA.tamanhoTela = 6.1f;
        // Celular celularB = new Celular();
        // celularB.nome = "Galaxy A51";
        // celularB.sistemaOperacional = "Android";
        // celularB.espacoArmazenamento = 128;
        // celularB.tamanhoTela = 6.5f;
        // System.out.println("------------------------------------------------");
        // System.out.format("Celular %s com tela de %.1f, com %dgb de memória e SO %s \n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        // System.out.format("Celular %s com tela de %.1f, com %dgb de memória e SO %s", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);

        // ---- aula 2 ----------
        // Personagem heroi = new Personagem();
        // heroi.nome = "Hercules";
        // heroi.nivel = 5;
        // heroi.forca = 15;
        // heroi.habilidades = new String[] {"Super forca", "Velocidade extra", "Invisibilidade"};
        // heroi.exibirInformacoes();
        // heroi.verificarHabilidades();
        // heroi.atacar("Goku", "Super forca");

        // ---- aula 4 --------
        // Filme filme = new Filme();

        // ---- aula 5: visibilidade de Atributos e Métodos
        // FestaVip festa = new FestaVip();
        // festa.entrar();
        // ContaNetflix contaInfantil = new ContaNetflix();
        // contaInfantil.entrar();
        // contaInfantil.assistirFilme("Barbie: Escola de Princesas");

        // ---- aula 6: getters and setters
        // Pessoa pessoa = new Pessoa();
        // System.out.println(pessoa.getNome());
        // pessoa.setNome("Luana");
        // System.out.println(pessoa.getNome());

        // exercício prático
        // Produto produto1 = new Produto();
        // produto1.setNome("Samsung Galaxy");
        // produto1.setPreco(1499.99);
        // produto1.setQuantidade(40);
        // produto1.exibirInformacoes();

        // produto1.removerEstoque(100);
        // produto1.exibirInformacoes();

        // - ex 2
        // ContaBancaria conta = new ContaBancaria();
        
        // conta.setNumeroConta("12345-6");
        // conta.setTitular("Luana Paes");
        // conta.setSaldo(1000.0);

        // conta.exibirInformacoes();

        // conta.depositar(500.0);
        // conta.sacar(300.0);
        // conta.sacar(1500.0); // Deve exibir erro

        // conta.exibirInformacoes();

        // aula 7: construtor
        // Usuario lunaf0_ = new Usuario("Luana Paes", 21, 1.79f);
        // lunaf0_.mostrarInformacoes();


        //aula 9 - interface
        // Circulo circulo = new Circulo(2);
        // System.out.println("area circulo: " + circulo.calcularArea());
        
        // Quadrado quadrado  = new Quadrado (5);
        // System.out.println("area quadrado: " + quadrado.calcularArea());

        // aula 10 - ArrayList
        // ArrayList<String> cidades = new ArrayList<String>();
        // cidades.add("Recife");
        // cidades.add("Jaboatao dos Guararapes");
        // cidades.add("Olinda");
        // Collections.sort(cidades);
        // for (String cidade : cidades) {
        //     System.out.println(cidade);
        // }

    }
}
 
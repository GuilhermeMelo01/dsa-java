package io.github.guilhermemelo01;

public class Main {

    static class Produto {
        String nome;
        double preco;
    }

    public static void main(String[] args) {
        Produto p = new Produto();

        System.out.println("Nome: " + p.nome);
        System.out.println("Preço: " + p.preco);
    }
}
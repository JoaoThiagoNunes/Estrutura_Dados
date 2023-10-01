package core;

import entites.ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

        // Adicionando elementos no início da lista
        
        lista.adicionarNoInicio(3);
        System.out.printf("Adicionando no inicio: "+lista +"\n");
        lista.adicionarNoInicio(2);
        System.out.printf("Adicionando no inicio: "+lista +"\n");
        lista.adicionarNoInicio(1);
        System.out.printf("Adicionando no inicio: "+lista +"\n");
        
        System.out.println("-------------------------------------");
        // Adicionando elementos no final da lista
        lista.adicionarNoFim(4);
        System.out.printf("Adicionando no fim: "+lista +"\n");
        lista.adicionarNoFim(5);
        System.out.printf("Adicionando no fim: "+lista +"\n");
        
        System.out.println("-------------------------------------");
        
        // Adicionando elemento na posição 2 (contagem começa em 0)
        lista.adicionarNaPosicao(10, 2);
        System.out.printf("Adicionando na posição: "+ lista +"\n");

        System.out.println("-------------------------------------");
        // Removendo elementos
        lista.removerDoInicio();
        System.out.printf("Removendo primeiro elemento: "+ lista +"\n");
        lista.removerDoFim();
        System.out.printf("Removendo último elemento: "+ lista +"\n");
        lista.removerNaPosicao(2);
        System.out.printf("Removendo na posição 2: "+ lista +"\n");

        System.out.println("-------------------------------------");
        // Obtendo elementos
        int elemento1 = lista.obter(0);
        int elemento2 = lista.obter(1);

        // Verificando tamanho e se a lista está vazia
        int tamanho = lista.tamanho();
        boolean estaVazia = lista.estaVazia();

        // Imprimindo a lista
        System.out.println("Lista: " + lista);

        // Imprimindo informações
        System.out.println("Elemento 1: " + elemento1);
        System.out.println("Elemento 2: " + elemento2);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Está vazia? " + estaVazia);
    }
}

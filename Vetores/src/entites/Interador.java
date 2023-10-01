package entites;

import java.util.Iterator;

public class Interador<T> implements Iterator<Object> {

    T[] itens;
    int posicao = 0;

    //Construtor Iterador
    public Interador(T[] itens) {
        this.itens = itens;
    }

    //Verifica se ainda existe dado 
    public boolean hasNext() {
        if (posicao < 0 || posicao >= itens.length) {
            return false;
        } else {
            return true;
        }
    }

    //Retorna o próximo valor 
    public Object next() {
        Object item = itens[posicao];
        posicao++;
        return item;
    }
}
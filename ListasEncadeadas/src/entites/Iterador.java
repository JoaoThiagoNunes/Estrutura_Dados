package entites;

import java.util.Iterator;

public class Iterador<T> implements Iterator{

    private No atual;

    public Iterador(No atual) {
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext() {
        if(atual!=null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        T elemento = (T) atual.getElemento();
        atual = atual.getProximo();
        return elemento;
    }

    public No getAtual() {
        return atual;
    }
}

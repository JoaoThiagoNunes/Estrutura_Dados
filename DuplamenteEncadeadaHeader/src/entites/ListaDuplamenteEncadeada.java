package entites;

public class ListaDuplamenteEncadeada<T> {
    private No<T> cabeca;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.cabeca = new No<>(null);
        this.cabeca.setProximo(null);
        this.cabeca.setAnterior(null);
        this.tamanho = 0;
    }

    public void adicionarNoInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (cabeca.getProximo() != null) {
            cabeca.getProximo().setAnterior(novoNo);
        }
        novoNo.setProximo(cabeca.getProximo());
        cabeca.setProximo(novoNo);
        novoNo.setAnterior(cabeca);
        tamanho++;
    }

    public void adicionarNoFim(T elemento) {
        No<T> novoNo = new No<>(elemento);
        No<T> atual = cabeca;

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        atual.setProximo(novoNo);
        novoNo.setAnterior(atual);
        novoNo.setProximo(null);
        tamanho++;
    }

    public void adicionarNaPosicao(T elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        } else if (posicao == 0) {
            adicionarNoInicio(elemento);
        } else if (posicao == tamanho) {
            adicionarNoFim(elemento);
        } else {
            No<T> novoNo = new No<>(elemento);
            No<T> atual = cabeca;
            int cont = 0;

            while (cont < posicao) {
                atual = atual.getProximo();
                cont++;
            }

            novoNo.setProximo(atual);
            novoNo.setAnterior(atual.getAnterior());
            atual.getAnterior().setProximo(novoNo);
            atual.setAnterior(novoNo);
            tamanho++;
        }
    }

    public void removerDoInicio() {
        if (tamanho > 0) {
            No<T> primeiro = cabeca.getProximo();
            cabeca.setProximo(primeiro.getProximo());
            if (primeiro.getProximo() != null) {
                primeiro.getProximo().setAnterior(cabeca);
            }
            tamanho--;
        }
    }

    public void removerDoFim() {
        if (tamanho > 0) {
            No<T> atual = cabeca;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            No<T> ultimo = atual;
            ultimo.getAnterior().setProximo(null);
            tamanho--;
        }
    }

    public void removerNaPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        } else if (posicao == 0) {
            removerDoInicio();
        } else if (posicao == tamanho - 1) {
            removerDoFim();
        } else {
            No<T> atual = cabeca;
            int cont = 0;

            while (cont <= posicao) {
                atual = atual.getProximo();
                cont++;
            }

            atual.getAnterior().setProximo(atual.getProximo());
            atual.getProximo().setAnterior(atual.getAnterior());
            tamanho--;
        }
    }

    public T obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        } else {
            No<T> atual = cabeca.getProximo();
            int cont = 0;

            while (cont < posicao) {
                atual = atual.getProximo();
                cont++;
            }

            return atual.getElemento();
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        No<T> atual = cabeca.getProximo();
        while (atual != null) {
            sb.append(atual.getElemento());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }
}


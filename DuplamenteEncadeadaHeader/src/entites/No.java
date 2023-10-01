package entites;

public class No<T> {
    private T elemento;
    private No<T> anterior;
    private No<T> proximo;

    public No(T elemento) {
        this.elemento = elemento;
        this.anterior = null;
        this.proximo = null;
    }

    public T getElemento() {
        return elemento;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }


	@Override
	public String toString() {
		
        	return "{elemento=" + elemento + ", proximo=" + proximo + ", anterior="+ anterior +"}";
       
	}
	
	
}

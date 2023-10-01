package entites;

public class No <T> {
	
	private T elemento;
	private No<T> proximo;
	private T anterior;
	
	
	
	public No(T elemento, No<T> proximo, T anterior) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
		this.anterior = anterior;
	}


	public No(T elemento) {
		super();
		this.elemento = elemento;
		this.proximo = null;
		this.anterior = null;
	}
	
	
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public T getAnterior() {
		return anterior;
	}

	public void setAnterior(T t) {
		this.anterior = t;
	}


	@Override
	public String toString() {
		
        	return "{elemento=" + elemento + ", proximo=" + proximo + ", anterior="+ anterior +"}";
       
	}
	
	
}

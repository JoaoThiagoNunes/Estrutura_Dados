package entites;

public class ListaEncadeada<T> {
	
	private No<T> inicio,fim;
	private int tamanho;
	
	public ListaEncadeada() {
		 
        this.inicio = null;
     	this.fim = null;
     	this.tamanho = 0;
	}

	public ListaEncadeada(No<T> inicio) {
		super();
		this.inicio = null;
		this.fim = null;
     	this.tamanho = 0;
	}
	
	public void add(T elemento, int position) {
		if (position < 0 || position >= tamanho) {
			throw new IllegalArgumentException("Posição inválida.");
		}

		else if (this.inicio == null && position > 0) {
			return;
		}
		else {
			int cont = 0;
			Iterador it = new Iterador(this.inicio);
			No<T> element = new No<T>(elemento);	
			
			while(it.hasNext()) {
				if (position != cont) {
					it.next(); 
					cont+=1;
 				}
				else {
					break;
				}
			}
			No<T> elementoList = it.getAtual();
			element.setProximo(elementoList);
			elementoList = element;
		}
	}
	
	public void addInicio(T elemento) {
		No<T> element = new No<T>(elemento);	
		
		if (tamanho == 0) {
			inicio = fim = element;
			this.tamanho += 1;
		}
		else {
			element.setProximo(inicio);
			this.inicio = element;
			this.tamanho += 1;
		}
	}
	
	public void addFim(T elemento) {
		No<T> element = new No<T>(elemento);	
		
		if (tamanho == 0) {
			inicio = fim = element;
			this.tamanho += 1;
		}
		else {
			Iterador it = new Iterador(this.inicio);	
			
			while(it.hasNext()) {
				if (it.getAtual().getProximo() != null) {
					it.next();                  
                } else {
                    break;
                }	
			}	
			No<T> elementList = it.getAtual();
			elementList.setProximo(element);
			element.setProximo(null);
			tamanho += 1;
			
		}
	}
	
	public boolean existeDado() {
		if (tamanho == 0) {
			return false;
		}
		else {return true;}
	}

    public T Recupera(int posicao) {
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) it.getAtual().getElemento();
        }
    }
	
	 public void removeInicio() {
	        
	        if (this.tamanho == 0) {
	            System.out.println("A lista está vazia!");
	            
	        } else if (inicio == fim) {
	            
	            inicio = fim = null;
	            this.tamanho -= 1;
	            
	        } else {
	            
	            inicio = inicio.getProximo();
	            this.tamanho -= 1;
	        }
	    }
	
	public void clear() {
		 this.inicio = null;
	     this.fim = null;
	     this.tamanho = 0;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}		
	
	
}

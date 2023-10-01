package entites;

import java.util.*;

public class Vetor<T> {

    //Vetor Genérico	
    private T[] vetor;

    //Variável que controla quantidade de elementos do vetor
    private int qntElementos;

    
    		// Construtores // 
    
    public Vetor(T[] vetor, int qntElementos) {
		super();
		this.vetor = vetor;
		this.qntElementos = qntElementos;
	}

	//Construtor específico da Classe Vetor
    public Vetor(int tam) {       
        //Criando um novo vetor genérico
        vetor = (T[]) new Object[tam];         
        this.qntElementos = 0;
        
    }
     
    		  // Métodos //

    //Método que verifica se existe dado em uma posição do vetor
    public boolean existeDado(int pos) {
        return vetor[pos] != null;
    }

    //Método que retorna o valor de uma posição do vetor
    public T Recuperar(int pos) {
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        return vetor[pos];
    }

    //Método que verifica se o vetor está vazio
    public boolean vazio() {
        return Tamanho() == 0;
    }

   //Método que adiciona no vetor usando o recurso de Iterador
    public void add(T elemento) {

        if (Tamanho() == vetor.length) {
            redimensionar();
        }

        //Passamos o vetor como parâmetro para o iterador
        Interador it = new Interador(vetor);

        int i=0;
        while (it.hasNext()){ //percorrendo o vetor usando iterador
        
            if (it.next() == null) {
                vetor[i] =  elemento;
                qntElementos++;
                break;
            }
            i++;
        }
    }
    
    public void addInicio(T elemento) {
    	T[] newVetor = (T[]) new Object[qntElementos + 1];   
    	
    	
    	Interador it = new Interador(vetor);
    	
    	//adiciona o novo elemento no inicio da lista
    	newVetor[0] = elemento;
    	
    	int i=1;
        while (it.hasNext()){
        	newVetor[i] = (T) it.next();
        	}i++;
        	
        	vetor = newVetor;
        }
    


   //Método que remove do vetor em uma determinada posição
    public void Remover(int posicao) throws ArrayIndexOutOfBoundsException {
    	//Cria um novo vetor 
    	T[] newVetor = (T[]) new Object[qntElementos];   
    	
    	
    	Interador it = new Interador(vetor);
    	
    	//Salva o conteudo do vetor original em um vetor temporario
        int i=0;
        while (it.hasNext()){
        	if(i != posicao) {
        		newVetor[i] = (T) it.next();
        	}
        }i++;
        
      //vetor atual 
       vetor = newVetor;
    }

    //Método que remove do início do vetor
    public void RemoverInicio() {
    	//Cria um novo vetor 
    	T[] newVetor = (T[]) new Object[qntElementos];   
    	
    	
    	Interador it = new Interador(vetor);
    	
    	//Salva o conteudo do vetor original em um vetor temporario
        int i=1;
        while (it.hasNext()){
        	newVetor[i] = (T) it.next();
        }i++;
        //vetor atual 
        vetor = newVetor;
    }

    //Método que remove do fim do vetor
    public void RemoverFim() {
    	//Cria um novo vetor 
    	T[] newVetor = (T[]) new Object[qntElementos];   
    	
    	
    	Interador it = new Interador(vetor);
    	
    	//Salva o conteudo do vetor original em um vetor temporario
        int i=0;
        while (it.hasNext()){
        	if (it.next() == null) {
                break; 
        	}
        	else {
        		newVetor[i] = (T) it.next();
        	}
        	
        }i++;
        
        //vetor atual
        vetor = newVetor;

    }

    
    //Método que retorna o tamanho atual do vetor
    public int Tamanho() {
        return qntElementos;
    }

    //Método que limpa/apaga todas as posições do vetor
    public void Limpar() {
    	T[] newVetor = (T[]) new Object[0];
    	qntElementos = 0;		
    	vetor = newVetor;
    	
    }

    //Método que dobra o tamanho do vetor caso ele atinja o seu tamanho.
    public void redimensionar(){
    	//Cria um novo vetor com o dobro de tamanho
    	T[] newVetor = (T[]) new Object[qntElementos * 2];   
    	
    	
    	Interador it = new Interador(vetor);
    	
    	//Salva o conteudo do vetor original em um vetor temporario
        int i=0;
        while (it.hasNext()){
        	newVetor[i] = (T) it.next();
        }i++;
        
        //vetor atual dobra de tamanho
        vetor = newVetor;
        
        
    }
}
package core;
import entites.ListaDuplamenteEncadeada;
public class Main {
	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<Integer> list = new ListaDuplamenteEncadeada<>();
		
		//verifica se tem dado na lista
		System.out.println(list.existeDado());
		
		//Adiciona 2 items no inicio da lista
		list.addInicio(2);
		System.out.println(list);
		list.addInicio(5);
		System.out.println(list);
		
		//Adiciona 1 item no fim da lista
		list.addFim(3);
		System.out.println(list);
		
		//verifica se exite dado na lista
		System.out.println(list.existeDado());
		
		//indica o elemento de acordo com a posição passada
		System.out.printf("Elemento: " + list.Recupera(2) + "\n");
		
		//Mostra a lista antes e depois de remover o primeiro elemento
		System.out.println(list);
		list.removeInicio();
		System.out.println(list);
		
		
		//Limpa a lista por completo
		list.clear();
		System.out.println(list);
		
		//Adiciona dois items no fim 
		list.addFim(2);
		System.out.println(list);
		list.addFim(4);
		System.out.println(list);
		
	
	}
}

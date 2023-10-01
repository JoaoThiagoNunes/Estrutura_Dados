package core;

import entites.ListaEncadeada;
public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<Integer> teste = new ListaEncadeada<>();
		
		System.out.println(teste.existeDado());
		teste.addInicio(1);
		
		teste.addInicio(2);
		
		
		
		System.out.println(teste);
		teste.addFim(5);
		System.out.println(teste);
		
		teste.add(4, 1);
		System.out.println(teste.existeDado());
		
		teste.removeInicio();
		System.out.println(teste);
		teste.clear();
		System.out.println(teste);
		System.out.print( teste.existeDado());
		teste.addInicio(2);
		System.out.println(teste);
	}

}

package core;

import entites.*;


public class Main
{
	public static void main(String[] args) {
		
		/*Instanciando a classe genérica Vetor e nesse momento informando
		que ela é do tipo Aluno*/
		Vetor<Aluno> vetor = new Vetor<Aluno>(3);
		
		System.out.println(vetor.existeDado(0));
		//Instanciando um aluno
		Aluno a = new Aluno("ANA", 30);
		Aluno a2 = new Aluno("MARIA", 35);
		Aluno a3 = new Aluno("João", 19);
		
		//Adicionando o aluno no vetor
		vetor.add(a);
		vetor.add(a2);	
		vetor.add(a3);
		System.out.println(vetor.existeDado(0));
		vetor.Recuperar(1);
		System.out.println(vetor.Recuperar(1));
		
		//imprimindo os dados do aluno
		System.out.println("Nome: "  + vetor.Recuperar(0).getNome());
		System.out.println("Idade: " + vetor.Recuperar(0).getIdade());
		System.out.println("Nome: "  + vetor.Recuperar(1).getNome());
		System.out.println("Idade: " + vetor.Recuperar(1).getIdade());	
		System.out.println("Nome: "  + vetor.Recuperar(2).getNome());
		System.out.println("Idade: " + vetor.Recuperar(2).getIdade());	
		
	}
}
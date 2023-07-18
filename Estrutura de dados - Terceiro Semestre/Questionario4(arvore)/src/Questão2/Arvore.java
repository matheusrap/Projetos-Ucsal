package Questão2;

import java.util.Scanner;

public class Arvore {
	
	//Colocando 10 números na arvore 
	
		//Declarando a árvore
		private static class ARVORE{
			public int numero;
			public ARVORE esquerda, direita;
		
}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		//vamos instanciar uma árvore vazia
		ARVORE raiz = null;
		int opcao, numero, multiplicacao;
		
	 do {
		System.out.println("Árvore binária de 10 numeros inteiros: ");
		System.out.println("1 - Preencher a árvore");
		System.out.println("2 - Multiplicar os números por 2");
		System.out.println("3 - Consultar em pré-ordem");
		System.out.println("4 - Sair");
				
		System.out.println("Escolha a sua opção: ");
		opcao = entrada.nextInt();
		
		//tratando as possiveis 
		if(opcao <1 || opcao > 4) {
			System.out.println("Não existe a funcionalidade implementada. ");
		} else if(opcao ==1) {//1 - Preencher a árvore
			raiz = null;
			for(int i= 1; i<= 10; i++) {
				System.out.println("Informe o numero a ser inserido: ");
				numero = entrada.nextInt();
				
				//vai inserindo na arvore
				raiz = inserir(raiz, numero);
			}
		}else if(opcao ==2) {//2 - Multiplicando os numeros por 2
			if(raiz == null) {
				System.out.println("Sua árvore está vazia. Digite opção 1 e preencha a árvore ");
			}else {
				multiplicacao = 0;
				multiplicacao = Multiplicar(raiz, multiplicacao);
				
			}
		}else if (opcao ==3) {//3 - Consultar em pré-ordem
			if(raiz == null) {
				System.out.println("Sua árvore está vazia. Digite opção 1 e preencha a árvore ");
			}else {
				System.out.println("Os números da árvore são: ");
				
				//chamando o método de consulta com o caminhamento em pré ordem
				consultarpreordem(raiz);
				
			}
		}
		
	 }while (opcao !=4);//Sair do programa
	}
	
	//metodo inserir na árvore
		public static ARVORE inserir (ARVORE aux, int num) {
			//primeiro passo: sera que a arvore tem dado? 
			if (aux == null) {
				aux = new ARVORE();
				aux.numero = num;
				aux.direita = null;
				aux.esquerda = null;
			} else if (num < aux.numero)
					aux.esquerda = inserir(aux.esquerda, num);
				   else
					   aux.direita = inserir(aux.direita, num);
			return aux;
			
		}
		
		//metodo para multiplicar por 2
		public static int Multiplicar(ARVORE aux, int multiplicar) {
			if(aux != null) {
				aux.numero *=2;
					multiplicar = Multiplicar(aux.direita, multiplicar);
					multiplicar = Multiplicar(aux.esquerda, multiplicar);
					
					System.out.println("O resultado da multiplicação é: " + aux.numero + "");
										
					}
			return multiplicar;
		}
		
		
		public static void consultarpreordem (ARVORE aux) {
			if(aux != null) {
				System.out.println(aux.numero);
				consultarpreordem(aux.esquerda);
				consultarpreordem(aux.direita);
			}
		}
}

package Questão8;

import java.util.Scanner;

public class ArvoreBinaria {
	
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
		int opcao, numero;
		
	 do {
		System.out.println("Árvore binária de 10 numeros inteiros: ");
		System.out.println("1 - Preencher a árvore");
		System.out.println("2 - Consultar em pós-ordem");
		System.out.println("3 - Sair");
				
		System.out.println("Escolha a sua opção: ");
		opcao = entrada.nextInt();
		
		//tratando as possiveis 
		if(opcao <1 || opcao > 3) {
			System.out.println("Não existe a funcionalidade implementada. ");
		} else if(opcao ==1) {//1 - Preencher a árvore
			raiz = null;
			for(int i= 1; i<= 10; i++) {
				System.out.println("Informe o numero a ser inserido: ");
				numero = entrada.nextInt();
				
				//vai inserindo na arvore
				raiz = inserir(raiz, numero);
						
			}
		}else if (opcao ==2) {//3 - Consultar em pós-ordem
			if(raiz == null) {
				System.out.println("Sua árvore está vazia. Digite opção 1 e preencha a árvore ");
			}else {
				System.out.println("Os números da árvore são: ");
				
				//chamando o método de consulta com o caminhamento em pós ordem
				consultarposordem(raiz);
				
			}
		}
		
	 }while (opcao !=3);//Sair do programa
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
		
	
		public static void consultarposordem (ARVORE aux) {
			if(aux != null) {
			
				consultarposordem(aux.esquerda);
				consultarposordem(aux.direita);
				System.out.println(aux.numero);
			}
		}
}


package quest�o1;

import java.util.Stack;

public class Tarefas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> pilha = new Stack<>();
		
		
	// Inserir tarefas na pilha: Digite Pilha.push("Tarefa");
		
		
		pilha.push("Lavar os pratos");
		pilha.push("Varrer a casa");
		pilha.push("Lavar as roupas");
		System.out.println("Tarefas da casa: " + pilha);
		
	
	// 	Para identificar a proxima tarefa da pilha: Digite pilha.peek();
		
		
		System.out.println("Proxima tarefa: " + pilha.peek());
		
	// Ap�s identificar a pr�xima tarefa Digite pilha.pop(); e remova o item da lista.
		
		pilha.pop();
		
	// Identifique a proxima tarefa : 
		
		System.out.println("Pr�xima tarefa: " + pilha.peek());
		
	// Siga os passos at� finalizar a lista.
		
	// Para verificar o status da lista digite
		
		System.out.println("Lista de tarefas: " + pilha);
		
	}

}

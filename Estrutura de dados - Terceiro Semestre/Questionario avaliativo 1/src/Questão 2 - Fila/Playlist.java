package questão2;

import java.util.LinkedList;
import java.util.Queue;

public class Playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<>();
		
	// Adicionando musicas a playlist:
		
		fila.add("Isso aqui ta bom demais");
		fila.add("Festa na Roça");
		fila.add("Olha pro Céu");
		
	// Verificando as músicas da playlist:
		
		System.out.println(" Lista de Musicas da Festa junina: " + fila);
		
	// Removendo as músicas da playlist:
		
		fila.remove();
	
	// Verificando status da playlist:
		
		System.out.println(" Lista de Músicas atualizada: " + fila);
		
		
		
		
	}

}

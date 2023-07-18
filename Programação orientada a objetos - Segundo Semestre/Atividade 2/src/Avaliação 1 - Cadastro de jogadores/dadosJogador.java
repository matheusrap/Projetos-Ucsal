package avaliação;

import java.text.SimpleDateFormat;

import java.util.Date;

public class dadosJogador {
	
	public static void main(String [] args) {
		jogadordefutebol jogador = new jogadordefutebol(null, null, null, null, null, null);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date nascimento = new Date();
		
				
		jogador.setNome("Josué Marques Pereira");
		jogador.setPosicao("Atacante");
		nascimento.setDate(15);
		nascimento.setMonth(6);
		nascimento.setYear(95);
		jogador.setNacionalidade("Brasileiro");
		jogador.setAltura(1.88);
		jogador.setPeso(80.0) ;
		
		
		System.out.println("Nome: " + jogador.getNome());
		System.out.println("Posição: " + jogador.getPosicao());
		System.out.println("Data de Nascimento: " + sdf.format(nascimento));
		System.out.println("Nacionalidade: " + jogador.getNacionalidade());
		System.out.println("Altura: " + jogador.getAltura());
		System.out.println("Peso: " + jogador.getPeso());
		
	
	
		Date hoje = new Date();
	
		System.out.println("Data de hoje: " + sdf.format(hoje));
		
	}

}	
		
package avaliação2;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(null, null, null);
		
		pessoa.setNome("Manoel Vilar Santos");
		pessoa.setEmail("mvsantos@gmail.com");
		pessoa.setWhatsapp("71988523695");
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Email: " + pessoa.getEmail());
		System.out.println("Whatsapp: " + pessoa.getWhatsapp());
		
	}
}

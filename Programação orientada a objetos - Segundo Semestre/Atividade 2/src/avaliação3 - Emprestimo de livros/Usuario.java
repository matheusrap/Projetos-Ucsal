package avaliação3;

public class Usuario {
	String nomeUsuario;
	int idade;
	String telefone;
	
	public Usuario(String nomeUsuario, int idade, String telefone) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.idade = idade;
		this.telefone = telefone;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}

package 

public class Usuario { 
	protected String nome; 
	protected String senha; 
	protected String email;
	protected String telefone;
	
	public Usuario() {
		this.nome = "";
		this.senha = "";
		this.email = ""; 
		this.telefone = ""; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String toString() {
	    return 	"--------- Dados de Usuario ----------" + "\n" +
	    		"Nome: " + this.nome + "\n" +
	    		"E-mail: " + this.email +"\n" +
	    		"Telefone: " + this.telefone;
	}
}

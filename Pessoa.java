public class Pessoa {
     
	private String nome;
	private String telefone;
	private String email;
	private String dataDeAniversario;

	public Pessoa (String nome, String telefone, String email, String dataDeAniversario){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataDeAniversario = dataDeAniversario;
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;    
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataDeAniversario() {
		return dataDeAniversario;
	}
	public void setDataDeAniversario(String dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}

	public String toString() {
		return "Aniversariante [Nome: " + nome + " Telefone: " + telefone + "Email: " +
				email + "Data de Aniversario: " + dataDeAniversario + "]\n";
	}
}

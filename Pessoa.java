public class Pessoa {
     
	private String nome;
	private String telefone;
	private String email;
	private Data dataDeAniversario;

	public Pessoa (String nome, String telefone, String email, Data dataDeAniversario){
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

	public Data getDataDeAniversario() {
		return dataDeAniversario;
	}
	public void setDataDeAniversario(Data dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}

	public String toString() {
		return "Aniversariante [Nome: " + this.nome + " Telefone: " + this.telefone + "Email: " +
				this.email + "Data de Aniversario: " + this.dataDeAniversario + "]\n";
	}
}

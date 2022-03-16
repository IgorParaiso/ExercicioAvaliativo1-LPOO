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
}

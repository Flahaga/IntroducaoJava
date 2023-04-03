package Poo;

public class Funcionário {

	private String nome;
	private String cargo;
	private int cep;
	private int idade;
	private String email;

	public Funcionário(String nome, String cargo, int cep, int idade, String email) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.cep = cep;
		this.idade = idade;
		this.email = email;
	}

     



	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getCargo() {
		return cargo;
	}





	public void setCargo(String cargo) {
		this.cargo = cargo;
	}





	public int getCep() {
		return cep;
	}





	public void setCep(int cep) {
		this.cep = cep;
	}





	public int getIdade() {
		return idade;
	}





	public void setIdade(int idade) {
		this.idade = idade;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public void visualizarInfo() {
 System.out.println("\n Este funcionário" + nome + "seu cargo é:" + cargo + "seu cep é:" + cep + "sua idade é:" + idade+ " seu email é:" + email );







}


}

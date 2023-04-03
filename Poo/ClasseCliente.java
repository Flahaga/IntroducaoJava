package Poo;

public class ClasseCliente {

	private String nome;
    private String endereço;
    private int cpf;
    private int idade;
    private String sexo;
	public ClasseCliente(String nome, String endereço, int cpf, int idade, String sexo) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void visualizarInfo() {
 System.out.println("\n A/O Cliente"+nome+"mora na rua"+endereço+"possui o cpf"+cpf+"é do sexo"+sexo+"e tem"+idade+"anos" );
    
    
	
    
    
    
    
    

	}

}

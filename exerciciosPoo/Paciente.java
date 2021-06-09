package exerciciosPoo;

public class Paciente {
	
	private String nome;
	private String genero;
	private String endereço;
	private String telefone;
	private String convenio;
	private String idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void Informacao() {
		System.out.println("=========== Dados do Paciente ===========\n" + "\nNome: " + nome
				              + "\nIdade: " + idade + "\nGênero: " + genero + "\nEndereço: " + endereço
				              + "\nTelefone: " + telefone + "\nConvênio: " + convenio);
	}
	
	
}

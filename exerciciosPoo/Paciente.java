package exerciciosPoo;

public class Paciente {
	
	private String nome;
	private String genero;
	private String endere�o;
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
				              + "\nIdade: " + idade + "\nG�nero: " + genero + "\nEndere�o: " + endere�o
				              + "\nTelefone: " + telefone + "\nConv�nio: " + convenio);
	}
	
	
}

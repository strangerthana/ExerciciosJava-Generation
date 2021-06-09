package exerciciosPoo;

public class ProdutoEletronico {
	
	private String produto;
	private String marca;
	private String nome;
	private String quantGB;
	private String quantCameras;
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getQuantGB() {
		return quantGB;
	}
	public void setQuantGB(String quantGB) {
		this.quantGB = quantGB;
	}
	public String getQuantCameras() {
		return quantCameras;
	}
	public void setQuantCameras(String quantCameras) {
		this.quantCameras = quantCameras;
	}
	
	public void Informacao() {
		System.out.println("INFORMAÇÕES DO PRODUTOS:\n" + "\nProduto: " + produto
							+ "\nMarca: " + marca + "\nNome: " + nome + "\nQuantidade de GB: "
							+ quantGB + "\nQuantidade de câmeras: " + quantCameras );
	}
	
	
}

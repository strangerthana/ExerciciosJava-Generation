package generation.polimorfismo.exercicio;

public class TestaTodosAnimais {

	public static void main(String[] args) {
		 
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.som();
		cachorro.corre();
		cachorro.sobe();
		
		System.out.println("______________________________________");
		
		cavalo.som();
		cavalo.corre();
		cavalo.sobe();
		
		System.out.println("______________________________________");
		
		preguica.som();
		preguica.corre();
		preguica.sobe();
		

	}

}

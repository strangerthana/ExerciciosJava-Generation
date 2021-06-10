package generation.polimorfismo.exercicio;

public class Cachorro implements Animais {

	@Override
	public void som() {
		System.out.println("\nO som do cachorro..... au au au\n");
		
	}

	@Override
	public void corre() {
			System.out.println("\nCachorro correndo.....\n");
		
	}

	@Override
	public void sobe() {
		System.out.println("\nCachorro subindo as escadas!!\n ");
		
	}
	
	
}

package generation.polimorfismo.exercicio;

public class Cavalo implements Animais {

	@Override
	public void som() {
		System.out.println("\nCavalo relinchando.... ihhh ihhh\n");
		
	}

	@Override
	public void corre() {
		System.out.println("\nCavalo correndo....\n");
		
	}

	@Override
	public void sobe() {
		System.out.println("\nCavalo subindo o morro!!\n");
		
	}

}

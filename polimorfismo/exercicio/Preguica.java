package generation.polimorfismo.exercicio;

public class Preguica implements Animais {

	@Override
	public void som() {
		System.out.println("\nSom da pregui�a..... zzzzZZ\n");
		
	}

	@Override
	public void corre() {
		System.out.println("\nPregui�a escalando.....\n");
		
	}

	@Override
	public void sobe() {
		System.out.println("\nPregui�a subindo na �rvore!!\n");
		
	}

}

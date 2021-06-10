package generation.polimorfismo.exercicio;

public class Preguica implements Animais {

	@Override
	public void som() {
		System.out.println("\nSom da preguiça..... zzzzZZ\n");
		
	}

	@Override
	public void corre() {
		System.out.println("\nPreguiça escalando.....\n");
		
	}

	@Override
	public void sobe() {
		System.out.println("\nPreguiça subindo na árvore!!\n");
		
	}

}

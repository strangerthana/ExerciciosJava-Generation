package exercicios.heranca.generation;

import exercicios.heranca.generation.animais.Cachorro;
import exercicios.heranca.generation.animais.Cavalo;
import exercicios.heranca.generation.animais.Preguica;

public class TestaTodosAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.setNome("Dachshund");
		cachorro1.setIdade(3);
		cachorro1.setSom("Latidos (Alta-frequência).");
		cachorro1.setDeveCorrer("Sim, corre.");
		
		Cavalo cavalo1 = new Cavalo();
		
		cavalo1.setNome("Puro-sangue inglês");
		cavalo1.setIdade(25);
		cavalo1.setSom("Relincho (Alto e agudo).");
		cavalo1.setDeveCorrer("Sim, corre 40 quilômetros por hora.");
		
		Preguica preguica1 = new Preguica();
		
		preguica1.setNome("preguiça-comum");
		preguica1.setIdade(15);
		preguica1.setSom("Sons de alta-frequência (pelas narinas).");
		preguica1.setSobeArvores("Sim, apresenta longas garras que o auxiliam a subir nas árvores");
		
		System.out.println("=====Dados dos Animais=====\n");
		System.out.println("DADOS DO CACHORRO:\n" + "\nNome: " + cachorro1.getNome() + "\nIdade: "
							+ cachorro1.getIdade() + "\nSom que emite: " + cachorro1.getSom() + "\nCorre?: "
							+ cachorro1.getDeveCorrer());
		
		System.out.println("__________________________________________________________");
		
		System.out.println("\nDADOS DO CAVALO:\n" + "\nNome: " + cavalo1.getNome() + "\nIdade: "
							+ cavalo1.getIdade() + "\nSom que emite: " + cavalo1.getSom() + "\nCorre?: "
							+ cavalo1.getDeveCorrer());
		
		System.out.println("____________________________________________________________");
		
		System.out.println("\nDADOS DA PREGUIÇA:\n" + "\nNome: " + preguica1.getNome() + "\nIdade: "
							+ preguica1.getIdade() + "\nSom que emite: " + preguica1.getSom() + "\nCorre?: "
							+ preguica1.getSobeArvores());
		
		
		
	}
}

package exerciciosPoo;

public class TestaPaciente {
	
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Maria Eduarda Machado");
		paciente1.setIdade("27 anos");
		paciente1.setGenero("feminino");
		paciente1.setEndereço("Av. Ramos de Costa n° 236");
		paciente1.setTelefone("(11) 65239874");
		paciente1.setConvenio("Amil");
		
		paciente1.Informacao();
	}
}

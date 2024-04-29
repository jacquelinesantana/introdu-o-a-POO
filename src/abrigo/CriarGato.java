package abrigo;

public class CriarGato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar o objeto
		Gato gatinho = new Gato(1, "SRD", true, "Femea", "Frajola", "Fred", 2, 10.0f); //objeto gatinho
		
		/*gatinho.nome = "Medusa";
		gatinho.id = 3;*/
		Gato gatinho2 = new Gato(2, "SRD", true, "Macho", "Laranja", "Anakin", 1, 8.0f);
		
		System.out.println(gatinho.getNome());
		
		gatinho.setNome("Dourado");
		
		System.out.println(gatinho.getNome());
		
		gatinho.visualizar();
		
		gatinho2.visualizar();

	}

}

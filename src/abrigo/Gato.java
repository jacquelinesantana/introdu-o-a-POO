package abrigo;

public class Gato {

	//atributos = caracteristicas 
	private int id;
	
	private String raca;
	
	private boolean castrado;
	
	private String sexo;
	
	private String cor;
	
	private String nome;
	
	private int idade;
	
	private float peso;

	//metodo construtor
	public Gato(int id, String raca, boolean castrado, String sexo, String cor, String nome,
			int idade, float d) {
		
		this.id = id;
		this.raca = raca;
		this.castrado = castrado;
		this.sexo = sexo;
		this.cor = cor;
		this.nome = nome;
		this.idade = idade;
		this.peso = d;
	}

	//recupera o valor id
	public int getId() {
		return id;
	}

	//alterar e guardar o valor no atributo id
	public void setId(int id) {
		this.id = id;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	/*public Gato(int id, String raca) {
		
	}*/
	
	public void visualizar() {
		System.out.println("\n\n******************************************");
		System.out.println(" ********* Dados do gatinho:"+this.id+" *********");
		System.out.println("Nome: "+ this.nome + " � da cor: " + this.cor);
		System.out.println("Idade: " + this.idade + " e ra�a: " + this.raca);
		
		
	}
	
	
}

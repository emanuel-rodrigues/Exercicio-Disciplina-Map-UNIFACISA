
public class Filho implements Familia{

	private Pai pai;
	private String email;
	
	public Filho(){
		pai = new Pai();
	}
	
	public void setNome(String nome){
		pai.nome = nome;
	}
	
	public void setIdade (int idade){
		pai.idade = idade;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getNome(){
		return pai.nome;
	}
	
	public int getIdade(){
		return pai.idade;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	
	
	@Override
	public String dados() {
		return "Nome: " + this.getNome() + "Idade" + this.getIdade() + "Email: " + this.getEmail();
	}

}

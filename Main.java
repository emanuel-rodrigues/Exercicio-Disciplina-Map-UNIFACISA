
public class Main {
	
	public static void mostrarDados(Familia membro){
		System.out.println(membro.dados());	
	}

	public static void main(String[] args) {
		
		Pai pai = new Pai();
		pai.nome = "João";
		pai.idade = 50;
		
		Filho filho = new Filho();
		filho.setNome("Carlos");
		filho.setIdade(20);
		filho.setEmail( "carlos@teste.com");
		
		Main.mostrarDados(pai);
		Main.mostrarDados(filho);
		
		
			
		
		
		
		
		
		

	}

}

package Diagrama;

public class Tema2 {
	
	public static void main(String[] args) {
		Tema tema2 = new Tema();
		
		tema2.setId(1);
		tema2.setNome("Alguem");
		tema2.setValorAluguel(22);
		tema2.setCorTolha(4);
		
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorTolha());

	}
}

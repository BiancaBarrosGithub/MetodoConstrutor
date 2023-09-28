package Diagrama;

public class Cliente2 {
	

	public static void main(String[] args) {
	Cliente cliente2 = new Cliente();
	
	cliente2.setId(1);
	cliente2.setNome("Alguem");
	cliente2.setCpf("12345678");
	cliente2.setRg("12344");
	cliente2.setTelefone("123123");
	
	System.out.println(cliente2.getId());
	System.out.println(cliente2.getNome());
	System.out.println(cliente2.getCpf());
	System.out.println(cliente2.getRg());
	System.out.println(cliente2.getTelefone());
	}
}

package Diagrama;

public class Endereco2 {

	public static void main(String[] args) {
		Endereco endereco2 = new Endereco();
		
		endereco2.setId(1);
		endereco2.setLograDouro("ok");
		endereco2.setNumero(3);
		endereco2.setComplemento("completar");
		endereco2.setBairro("vila barte");
		endereco2.setCidade("california");
		endereco2.setCep("california");
		endereco2.setUf("sim");
		
		System.out.println(endereco2.getId());
		System.out.println(endereco2.getLograDouro());
		System.out.println(endereco2.getNumero());
		System.out.println(endereco2.getComplemento());
		System.out.println(endereco2.getBairro());
		System.out.println(endereco2.getCidade());
		System.out.println(endereco2.getCep());
		System.out.println(endereco2.getUf());
		}

	}


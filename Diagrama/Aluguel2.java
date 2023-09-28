package Diagrama;

public class Aluguel2 {

	public static void main(String[] args) {
		Aluguel aluguel2 = new Aluguel();
		
		aluguel2.setId(1);
		aluguel2.setDataFesta("22/3");
		aluguel2.setHorarioInicio("12");
		aluguel2.setHorarioTermino("17");
		aluguel2.setValorCobrado(25);
		
		System.out.print(aluguel2.getId());
		System.out.print(aluguel2.getDataFesta());
		System.out.print(aluguel2.getHorarioInicio());
		System.out.print(aluguel2.getHorarioTermino());
		System.out.print(aluguel2.getValorCobrado());
		

	}

}

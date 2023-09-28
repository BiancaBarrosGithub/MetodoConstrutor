package Diagrama;

public class Tema {
	private int id;
	private String nome;
	private double valorAluguel;
	private int corTolha;
	
	public Tema(){
		
	}
	
	public Tema(int id, String nome, double valorAluguel, int corTolha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corTolha = corTolha;
	}
	public Tema( String nome, int corTolha, double valorAluguel,int id) {
		this.nome = nome;
		this.corTolha = corTolha;
		this.valorAluguel = valorAluguel;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public int getCorTolha() {
		return corTolha;
	}
	public void setCorTolha(int corTolha) {
		this.corTolha = corTolha;
	}
	
}


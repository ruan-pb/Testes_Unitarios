package Testes.Retangulo;

public class Retangulo {
	private int base;
	private int altura;
	
	
	
	
	
	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public int calcularArea() {
		return this.base*this.altura;
	}
	public int calcularPerimetro() {
		return this.altura*2+this.base*2 +1;
	}
	
	
	/* para dar bug,e la na classe principal no System.out.println acusar como false o calcular, pois o resultado não vai dar 24 de acordo com a classe RetanguloTeste no valorEsperado.
	public int calcularPerimetro() {
		return this.altura*2+this.base*2;
	}
	*/
	

}

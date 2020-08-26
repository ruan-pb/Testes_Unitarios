package Testes.Retangulo;

public class RetanguloTeste {
	
	private Retangulo retangulo;
	
	
	public boolean calcularArea() {
		this.retangulo = new Retangulo(2, 10);
		int valorEsperado = 20;
		int resultado = retangulo.calcularArea();
		if(valorEsperado==resultado) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean calcularPerimetro() {
		this.retangulo = new Retangulo(2, 10);
		int valorEsperado = 24;
		int resultado = retangulo.calcularPerimetro();
		if(valorEsperado == resultado) {
			return true;
		}
		else {
			return false;
		}
			
		
	}
		

}

package Testes.Retangulo;

public class main {
	
	public static void main(String args[]) {
		
		var teste= new RetanguloTeste();
		boolean resultado;
		
		
		resultado = teste.calcularArea();
		System.out.println(resultado);
		
		
		resultado = teste.calcularPerimetro();
		System.out.println(resultado);
	}

}

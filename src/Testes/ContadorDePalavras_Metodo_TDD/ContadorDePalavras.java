package Testes.ContadorDePalavras_Metodo_TDD;

public class ContadorDePalavras {
	
	public static int contarPalavras(final String texto) {
		if(texto.isEmpty()) {
			return 0;
		}
		
		return texto.split(" +").length;
	}
	
	

}

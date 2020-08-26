package Testes.ContadorDePalavras_Metodo_TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class ContadorDePalavrasTest {

	@Test
	public void testContarPalavrasTextoNenhumaPalavraSucesso() {
		
		final String texto = "";
		int palavras  = ContadorDePalavras.contarPalavras(texto);
		assertEquals(0, palavras);
		
		
	}
	@Test
	public void testContarPalavrasTextoUmaPalavraSucesso() {
		
		final String texto = "Abacaxi";
		int palavras  = ContadorDePalavras.contarPalavras(texto);
		assertEquals(1, palavras);
		
		
	}
	@Test
	public void testContarPalavrasTextoDuasPalavraSucesso() {
		
		final String texto = "Abacaxi Morango";
		int palavras  = ContadorDePalavras.contarPalavras(texto);
		assertEquals(2, palavras);
		
		
	}
	
	/*
	de principio vai dar erro, pois a cada unico espa�o � contado como uma nova palavra
	 para solucionar esse problema, o metodo contarPalavras deve, conter um sinal de + no split, EXEMPLO( texto.split(" +").length; ), isso informa ao compilador que quando tiver mais de 
	um espa�o, ele quebre esse String do mesmo jeito, que quebraria com apenas um espa�o 
	 */
	@Test
	public void testContarPalavrasTextoDuasPalavrasDoisEspa�oesSeguidosSucesso() {
		
		final String texto = "Abacaxi  Morango";
		int palavras  = ContadorDePalavras.contarPalavras(texto);
		assertEquals(2, palavras);
		
		
	}
	@Test
	public void testContarPalavrasTextoNenhumaPalvraUmEspa�oSucesso() {
		
		final String texto = "   ";
		int palavras  = ContadorDePalavras.contarPalavras(texto);
		assertEquals(0, palavras);
		
		
	}
	@Test
	public void testContarPalavrasTextoTresPalavrasDoisEspa�oSeguidosSucesso() {
		
		final String texto = "Abacaxi Morango  Lim�o  ";
		int palavras  = ContadorDePalavras.contarPalavras(texto);
		assertEquals(3, palavras);
		
		
	}
	
	// nessa ocasi�o eu quero que lance uma exce��o falando que n�o se pode colocar valor Nulo "null".
	@org.junit.Test(expected = java.lang.NullPointerException.class)
	public void testContarPalavrasTextoPalavrasNula() {
		final String texto = null;
		int palavras  = ContadorDePalavras.contarPalavras(texto);
		assertEquals(0, palavras);
		
		
	}

}

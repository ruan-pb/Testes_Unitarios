package Testes.Numeros;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosTest {
	
	private Numeros numero;

	@Test
	public void testNumeroPar() {
		numero = new Numeros();
		boolean result  = numero.numeroPar(8);
		assertTrue(result);
		//assertEquals(true, result);
		System.out.println(result);
	}

	@Test
	public void testAreaDoQuadrado() {
		numero = new Numeros();
		int result  = numero.areaDoQuadrado(5);
		assertEquals(25, result);
		System.out.println(result);
	}
	
	/* nessa ocasão daria erro,, pois a função espera receber o numero 26 e recebe 25 a função do testador, é informa que pode ocorrer esses erros, para que o desenvolvedor possa corrigir isso no seu codigo fonte
	@Test
	public void testAreaDoQuadrado() {
		numero = new Numeros();
		int result  = numero.areaDoQuadrado(5);
		assertEquals(26, result);
		System.out.println(result);
	}
	*/

	@Test
	public void testDivisivil() {
		numero = new Numeros();
		boolean result  = numero.divisivil(8, 2);// se por acaso colocar zero para dividir, daria erro, deveria informa o desenvolvedor para tratar essa exceção
		assertTrue(result);
		//assertEquals(true, result);
		System.out.println(result);
	}

}

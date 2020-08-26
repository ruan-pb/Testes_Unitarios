package Testes.Calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSomar() {
		var calculadora = new Calculadora();
		int resultado = calculadora.somar(6, 4);
		//int resultadoEsperado = 10;
		
		//assertTrue(resultado == resultadoEsperado);
		assertEquals(10, resultado);
	}

}

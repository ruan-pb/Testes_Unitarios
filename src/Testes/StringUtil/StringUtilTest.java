package Testes.StringUtil;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;



class StringUtilTest {
	
	
	
	@Before
	public void before() {
		System.out.println("Iniciando o teste");
	}
	@After
	public void after() {
		System.out.println("Teste finalizado");
	}

	@Test
	public void testIsEmptyComTexto() {
		boolean b;
		
		b = StringUtil.isEmpty("abc");
		Assert.assertFalse(b);
	}
	
	@Test
	public void testIsEmptyNull() {
		boolean b;
		
		b = StringUtil.isEmpty(null);
		Assert.assertTrue(b);
	}
	@Test
	public void testIsEmptyVazio() {
		boolean b;
		
		b = StringUtil.isEmpty("");
		Assert.assertTrue(b);
	}


	@Test
	public void testReversePassandoUmTexto() {
		
		String texto = StringUtil.reverse("Ruan");
		Assert.assertEquals("nauR", texto);
		
	}
	@Test
	public void testReversePassandoNull() {
		
		String texto = StringUtil.reverse(null);
		Assert.assertNull(texto);
		
	}
	

}

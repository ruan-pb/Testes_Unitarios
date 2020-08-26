package Testes.StringUtil;






import org.junit.Assert;
import org.junit.jupiter.api.Test;



class ArraysUtilTest {

	@Test
	public void testReverse() {
		Integer[] numeros = {1,2,3,4,5};
		ArraysUtil.reverse(numeros);
		
		Integer[] esperados = {5,4,3,2,1};
		Assert.assertArrayEquals(esperados, numeros);
		
		
	}

}

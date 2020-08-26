package Testes.StringUtil;

public class StringUtil {
	
	public static boolean isEmpty (String a) {
		if(a == null) {
			return true;
		}
		if(a.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static String reverse(String texto) {
		
		if(texto == null) {
			return texto;
		}
		
		StringBuilder sb =new StringBuilder(texto);
		sb.reverse();
		return sb.toString();
	}

}

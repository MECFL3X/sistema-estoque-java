package util;

public class GeradorCodigo {

	public static String gerarCodigo(String prefixo, int numero) {
		return prefixo + "-" + String.format("%03d", numero);
	}
}

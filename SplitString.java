
public class SplitString {
	public static void main(String[] args) {
		String texto = "O4Java1é3uma9linguagem9orientada8aobjetos";
		//int texto1 = texto.length();
		//System.out.println(texto1);
		
		String[] palavras = texto.split("\\d+"); // O \\d, separa os digitos que tem na string, \\d+ separa um ou mais
		
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}

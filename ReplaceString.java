
public class ReplaceString {
	public static void main(String[] args) { //Expreções regulares é para buscar subString em uma String
		String texto = "O valor do produto é R$ @xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx@.";
		
		String novoTexto = texto.replaceAll("@x+@", "2,50"); //@x+@ diz que x pode haver mais de uma vez 
		System.out.println(novoTexto);
	}
}

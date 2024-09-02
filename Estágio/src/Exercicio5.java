import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		String original = scanner.nextLine();
		scanner.close();
	
		String invertida = inverterString(original);

		
		System.out.println("Original: " + original);
		System.out.println("Invertida: " + invertida);

		
	}

	public static String inverterString(String string) {
		char[] caracteres = string.toCharArray(); 
		int n = caracteres.length;
		for (int i = 0; i < n / 2; i++) {
			char temp = caracteres[i];
			caracteres[i] = caracteres[n - i - 1];
			caracteres[n - i - 1] = temp;
		}
		return new String(caracteres);
	}
}
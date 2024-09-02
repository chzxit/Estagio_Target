import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		

		if (calculoFibonacci(num)) {
			System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
		}else {
			System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
		}

	}

	public static boolean calculoFibonacci(int num) {
		if (num == 0 || num == 1) {
			return true;
		}

		int valorUm = 0;
		int valorDois = 1;
		int soma = valorUm + valorDois;

		while (soma <= num) {
			if (soma == num) {
				return true;
			}
			valorUm = valorDois;
			valorDois = soma;
			soma = valorUm + valorDois;
		}
		return false;
		
	}
}

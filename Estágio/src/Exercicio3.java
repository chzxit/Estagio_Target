public class Exercicio3 {
	public static void main(String[] args) {
		double[] faturamentoDiario = { 2500.50, 3000.75, 0, 4200.00, 5000.00, 3200.50, 0, 3700.00, 4300.75, 2900.25, 0,
				4600.50, 5200.75, 0, 4900.00, 6000.00, 3300.75, 3100.00, 0, 4100.50, 3800.00, 4500.25, 0, 5400.75,
				5300.50, 5100.75, 3200.00, 0, 4500.00, 5700.25 };

		double menorFaturamento = Double.MAX_VALUE;
		double maiorFaturamento = Double.MIN_VALUE;
		double somaFaturamento = 0;
		int diasComFaturamento = 0;
		int diasAcimaDaMedia = 0;

		for (double faturamento : faturamentoDiario) {
			if (faturamento > 0) {
				if (faturamento < menorFaturamento) {
					menorFaturamento = faturamento;
				}
				if (faturamento > maiorFaturamento) {
					maiorFaturamento = faturamento;
				}
				somaFaturamento += faturamento;
				diasComFaturamento++;
			}
		}

		double mediaMensal = somaFaturamento / diasComFaturamento;

		for (double faturamento : faturamentoDiario) {
			if (faturamento > mediaMensal) {
				diasAcimaDaMedia++;
			}
		}

		System.out.printf(" Menor faturamento:" + menorFaturamento + "\n");
		System.out.printf(" Maior faturamento:" + maiorFaturamento + "\n");
		System.out.printf(" Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
	}
}
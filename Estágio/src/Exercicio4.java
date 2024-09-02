
public class Exercicio4 {
	public static void main(String[] args) {
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 27165.48;
		double OUTROS = 19849.53;
		double valorTotalMensal = (SP + RJ + MG + OUTROS);

		System.out.println("Percentual de representação de Sp: " + (SP / valorTotalMensal) * 100 + "%" + "\n");
		System.out.println("Percentual de representação de Rj : " + (RJ / valorTotalMensal) * 100 + "%" + "\n");
		System.out.println("Percentual de representação de Mg: " + (MG / valorTotalMensal) * 100 + "%" + "\n");
		System.out.println("Percentual de representação dos outros: " + (OUTROS / valorTotalMensal) * 100 + "%" + "\n");

	}

}

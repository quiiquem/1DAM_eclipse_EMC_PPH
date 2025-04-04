import java.text.DecimalFormat;
import java.util.Scanner;

public class Extra2_PPH {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#0.00€"); // he añadido esto para simplemente para la estetica en la
																// terminal

		System.out.println("Introduzca sus horas trabajadas a lo largo de la semana:");
		int horas = sc.nextInt();

		double salario = calculoSalarioSemanal(horas);
		System.out.println("Su salario sería de: " + formato.format(salario));

		sc.close();

	}

	public static double calculoSalarioSemanal(int horas) {

		double salario = 0;

		if (horas <= 40) {
			System.out.println("Como has trabajado menos de 40 horas, se te pagará 16€ la hora.");
			salario = horas * 16;
			return salario;
		}

		else {
			System.out.println("Como has trabajado más de 40 horas:");
			System.out.println("\t-Cada una de las primeras 40 horas se te pagarán 16€");
			System.out.println("\t-Las demás horas serán 20€ más por cada una de ellas");

			for (int i = 0; i < 40; i++) {
				salario += 16;
			}

			for (int i = 0; i < horas - 40; i++) {
				salario += 20;
			}

			return salario;

		}
	}

}

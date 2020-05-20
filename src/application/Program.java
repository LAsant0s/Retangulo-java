package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, altura;
		int opcao = 1;

		// leitura da largura com verificação
		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while (largura < 1) {
			if (largura < 1) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
				largura = sc.nextDouble();
			}
		}
		// leitura da altura com verificação
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		while (altura < 1) {
			if (altura < 1) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
				altura = sc.nextDouble();
			}
		}

		while (opcao != 3) {
			// menu
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = sc.nextInt();

			System.out.println();

			switch (opcao) {
			case 1:
				System.out.printf("AREA = %.1f\n", largura * altura);
				break;
			case 2:
				System.out.printf("PERIMETRO = %.1f\n", (largura * 2) + (altura * 2));
				break;
			case 3:
				System.out.println("FIM DO PROGRAMA!");
				break;
			default:
				System.out.println("OPCAO INVALIDA");
				break;
			}
		}

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double largura;
		
		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while(largura < 1){
			if(largura < 1) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
				largura = sc.nextDouble(); 
			}
		}
		

	}

}

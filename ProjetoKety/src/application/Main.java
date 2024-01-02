package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.CompanhiaTrem;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = null;
		
		CompanhiaTrem companhia = null;
		
		try {
			
			System.out.println("Seja bem-vindo!");
			
			while (true) {
				
				System.out.println("Voce deseja fazer uma viagem? ");
				String escolha = scanner.nextLine();
				
				if (escolha.equals("Sim")) {
					
					System.out.print("Informe o seu nome: ");
					String nome = scanner.nextLine();
					System.out.print("Informe o seu RG: ");
					String rg = scanner.nextLine();
					System.out.println("Informe a sua idade: ");
					Integer idade = scanner.nextInt();
					
					
					
					
					
				}
					
				
				
				
				System.out.println();
			}
			
			
			
			
			
			
		}catch(RuntimeException e){
			
		}
		
		
		
		
		
		
		
		
	}
}

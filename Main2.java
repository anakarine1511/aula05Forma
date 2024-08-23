package principal;

import java.util.Scanner;

import entidade.Forma;
import entidade.Triangulo;
import entidade.Retangulo;

public class Main2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Qual tipo de forma você quer fazer: ");
		String tipo = scn.nextLine();
		if(tipo.equalsIgnoreCase("triangulo")) {
			System.out.println("Digite a base: ");
			double base = scn.nextDouble();
			System.out.println("Digite a altura: ");
			double altura = scn.nextDouble();
			Triangulo triangulo = new Triangulo(base, 0, altura);
			System.out.println(triangulo.calcularArea());
			
		}else if(tipo.equalsIgnoreCase("retangulo")) {
			System.out.println("Digite a largura: ");
			double largura = scn.nextDouble();
			System.out.println("Digite a altura: ");
			double altura = scn.nextDouble();
			Retangulo retangulo = new Retangulo(0, largura, altura);
			
				
		
	
		

	}

	}
}

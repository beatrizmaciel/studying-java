package br.com.beatrizmaciel.git;

import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
			// Faça um programa que mostre a mensagem
			// Olá, Mundo! na tela
					
					
			System.out.println("Olá, mundo!");
					
					
			// Faça um programa que peça um número e então mostre
			// a mensagem O número informado foi [número]
	
					
			Scanner scan = new Scanner(System.in);
					
			System.out.println("Digite um numero:");
			int numero = scan.nextInt();
			System.out.println("O numero é: " + numero);
					
					
			// Faça um programa que peça dois números e imprima a soma
					
			System.out.println("Digite dois números:");
			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();
			int resultado = numero1 + numero2;
			System.out.println("A soma dos números é: " + resultado);
					
			// Faça um programa que mostre as 4 notas bimestrais
			// e mostre a média
					
			System.out.println("Digite suas notas bimestrais:");
			double nota1 = scan.nextDouble();
			double nota2 = scan.nextDouble();
			double nota3 = scan.nextDouble();
			double nota4 = scan.nextDouble();
			double notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println("Sua média é: " + notaFinal);
					
			//Faça um programa que calcule metros em centímetros
					
			System.out.println("Converter metros em centímetros:");
			double meter = scan.nextInt();
			double centimeters = 100 * meter;
			System.out.println("A conversão em centímetros é: " + centimeters);
					
					
			//Descobrir a área de um círculo
					
			double pi = 3.14;
			System.out.println("Digite o raio do círculo para saber a área:");
			double r = scan.nextDouble();
			double area = pi * r * r;
			System.out.println("A área do círculo é: " + area);
		
			//Calcular área do quadrado
			
			System.out.println("Para descobrir a área, digite a lateral do quadrado:");
			double lado = scan.nextDouble();
			double areaQuadrado = lado * lado;
			System.out.println("A área do quadrado é: " + areaQuadrado);
			System.out.println("O dobro da área do quadrado é: " + areaQuadrado * 2);

	}

}

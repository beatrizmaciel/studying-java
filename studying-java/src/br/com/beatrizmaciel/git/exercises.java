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
		
			// Perguntar quanto ganha por hora e calcular o total por mês
			
			System.out.println("Quanto você ganha por hora?");
			double hora = scan.nextDouble();
			System.out.println("Quantos horas você trabalha por mês?");
			double horasMes = scan.nextDouble();
			System.out.println("O seu salário por mês é: " + hora * horasMes);
			
			// Transformar Farenheit em Celsius
			System.out.println("Digite a temperatura em Fahrenheit:");
			double farenheit = scan.nextDouble();
			double celsius = (5 * (farenheit - 32) / 9);
			System.out.println("A temperatura convertida para Celsius é: " + celsius);
			
			// Transformar Celsius em Farenheit
			System.out.println("Digite a temperatura em Celsius:");
			double celsius = scan.nextDouble();
			double farenheit = celsius * 1.8 + 32;
			System.out.println("A temperatura convertida para Farenheits é: " + farenheit);
			
			
			// Pedir 2 números inteiros e 1 real. Calcular:
			// 1. o produto do dobro do primeiro com a metade do segundo
			// 2. a soma do triplo do primeiro com o terceiro
			// 3. o terceiro elevado ao cubo
		
			System.out.println("Digite dois números inteiros e um número real:");
			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();
			double numero3 = scan.nextDouble();
			System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + numero1 * 2 + numero2/2);
			System.out.println("A soma do triplo do primeiro com o terceiro é: " + numero1 * 3 + numero3);
			System.out.println("O terceiro elevado ao cubo é: " + numero3 * numero3);

			// Peso ideal
			System.out.println("Entre sua altura:");
			double altura = scan.nextDouble();
			double pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal é: " + pesoIdeal);
			
			// Perguntar quanto ganha por hora, o número de horas
			// trabalhadas por mês. Calcular o total do salário,
			// sabendo que são descontados 11% para o Imposto de Renda
			// 8% para o INSS e 5% para o sindicato. Indique:
			// 1. O salário bruto
			// 2. Quanto pagou ao INSS
			// 3. O salário líquido
			// 4. Calcule os descontos do salário líquido
			
			System.out.println("Quanto você ganha por hora?");
			double hora = scan.nextDouble();
			System.out.println("Quantas horas você trabalha por mês?");
			double horasMes = scan.nextDouble();
			double salarioBruto = hora * horasMes;
			System.out.println("Seu salário bruto é: " + salarioBruto);
			System.out.println("Você pagou " + ((salarioBruto*8)/100) + " ao INSS");
			System.out.println("Você pagou " + ((salarioBruto*5)/100) + " ao sindicato");
			System.out.println("Seu salário líquido é " + ((salarioBruto*76)/100));
			System.out.println("O que foi descontado do seu salário foi: " + (salarioBruto*24)/100);
			System.out.println("Em resumo. Seu salário bruto é " + salarioBruto + 
					", foram descontados " + (salarioBruto*24)/100 + 
					" e seu salário líquido é " + (salarioBruto*76)/100);
			
			
			// Pedir tamanho de arquivo em MB + velocidade da internet em Mbps
			// calcular e informar o tempo aproximado de download em minutos
			
			System.out.println("Qual é o tamanho (em MB) do arquivo para download?");
			double tamanhoArquivo = scan.nextDouble();
			System.out.println("Qual é a velocidade (em Mbps) da internet?");
			double velocidadeInternet = scan.nextDouble();
			double tempoDownload = tamanhoArquivo / velocidadeInternet;
			System.out.println("O download do seu arquivo vai demorar " + tempoDownload + " minutos.");


	}

}

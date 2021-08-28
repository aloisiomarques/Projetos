package com.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner calc = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o primeiro valor: ");
		a = calc.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = calc.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma"+soma);
		System.out.println("subtração"+subtracao);
		System.out.println("Multiplicação"+multiplicacao);
		System.out.println("Divisão"+divisao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

}
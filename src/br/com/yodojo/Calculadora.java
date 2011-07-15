package br.com.yodojo;

public class Calculadora {

	public int soma(int a, int b) {

		return a + b;
	}

	public int subtrai(int i, int j) {
		return i - j;
	}

	public int multiplicar(int i, int j) {
		return i * j;
	}

	public int dividir(int i, int j) {
		if (j == 0)
			throw new ArithmeticException();

		return i / j;
	}
}
package br.com.yodojo;

public class Fibonacci {

	public int getNumeroFibonacciNaPosicao(int posicao) throws NumeroInvalidoException{
		if (posicao <= 0)
			throw new NumeroInvalidoException();

		if (posicao == 1)
			return 0;
		if (posicao == 2)
			return 1;	

		return getNumeroFibonacciNaPosicao(posicao - 2) + getNumeroFibonacciNaPosicao(posicao - 1);
	}
}
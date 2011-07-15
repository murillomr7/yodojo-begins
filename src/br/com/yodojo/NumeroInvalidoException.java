package br.com.yodojo;

public class NumeroInvalidoException extends Exception{
	
	public NumeroInvalidoException(){
		super("Não existe sequencia negativo na sequencia de Fibonacci");
	}

}

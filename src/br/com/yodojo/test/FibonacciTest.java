package br.com.yodojo.test;

import static org.junit.Assert.*;
import br.com.yodojo.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	private Fibonacci fibo;
	
	@Before
	public void setUp(){
		fibo = new Fibonacci();
	}
	
	@Test
	public void primeiraPosicaoDeveRetornarZero() throws NumeroInvalidoException {
		assertEquals(0, fibo.getNumeroFibonacciNaPosicao(1));
	}
	
	@Test
	public void segundaPosicaoDeveRetornarUm() throws NumeroInvalidoException{
		assertEquals(1, fibo.getNumeroFibonacciNaPosicao(2));
	}
	
	@Test
	public void terceiraPosicaoDeveRetornarUm() throws NumeroInvalidoException {
		assertEquals(1, fibo.getNumeroFibonacciNaPosicao(3));
	}
	
	@Test
	public void quartaPosicaoDeveRetornarDois() throws NumeroInvalidoException {
		assertEquals(2, fibo.getNumeroFibonacciNaPosicao(4));
	}
	
	@Test
	public void decimaTerceiraPosicaoDeveRetornarCentoEquarentaEquatro() throws NumeroInvalidoException {
		assertEquals(144, fibo.getNumeroFibonacciNaPosicao(13));
	}
	
	@Test(expected=NumeroInvalidoException.class)
	public void testeComNumeroNegativo() throws NumeroInvalidoException {
		fibo.getNumeroFibonacciNaPosicao(-13);
	}
	
	@Test(expected=NumeroInvalidoException.class)
	public void posicaoZeroDeveRetornarUmaExcessao() throws NumeroInvalidoException {
		fibo.getNumeroFibonacciNaPosicao(0);
	}
}
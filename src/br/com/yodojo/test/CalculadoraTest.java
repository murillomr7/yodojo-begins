package br.com.yodojo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.yodojo.Calculadora;

public class CalculadoraTest {

	Calculadora calc = new Calculadora();

	@Test
	public void deveSomarDoisInteirosPositivos() {
		assertEquals(2, calc.soma(1, 1));
	}

	@Test
	public void deveSomarDoisInteirosPositivos2() {
		assertEquals(4, calc.soma(2, 2));
	}

	@Test
	public void deveSomarUmPositivoEumNegativo() {
		assertEquals(-1, calc.soma(2, -3));
	}

	@Test
	public void deveSubtrairIguais() {
		assertEquals(0, calc.subtrai(1, 1));
	}

	@Test
	public void deveSubtrairDoisNumerosInteiros() {
		assertEquals(-1, calc.subtrai(5, 6));
	}

	@Test
	public void deveMultiplicarDoisNumerosPositivos() {
		assertEquals(4, calc.multiplicar(2, 2));
	}

	@Test
	public void deveMultiplicarDoisInteirosNegativos() {
		assertEquals(6, calc.multiplicar(-2, -3));

	}

	@Test
	public void deveMultiplicarNegativoEPositivo() {
		assertEquals(-6, calc.multiplicar(-2, 3));

	}

	@Test
	public void deveDividirDoisNumerosPositivos() {
		assertEquals(2, calc.dividir(4, 2));

	}

	@Test(expected = ArithmeticException.class)
	public void deveRetornarExcessaoDivisaoPorZero() throws ArithmeticException {
		assertEquals(2, calc.dividir(4, 0));
	}

	@Test
	public void deveRetornaParteInteiraDaDivicaoDeDoisNumeros() {
		assertEquals(3, calc.dividir(15, 4));
	}
}
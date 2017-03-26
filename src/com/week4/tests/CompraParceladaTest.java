package com.week4.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.week4.CompraParcelada;

public class CompraParceladaTest {

	CompraParcelada compraParcelada;


	@Test
	public void test1Parcela() {
		compraParcelada = new CompraParcelada(500.0, 1, 0.01);
		assertEquals(505, compraParcelada.total(), 1);
	}

	@Test
	public void test2Parcelas() {
		compraParcelada = new CompraParcelada(500.0, 2, 0.01);
		assertEquals(510, compraParcelada.total(), 1);
	}

	@Test
	public void test5Parcelas() {
		compraParcelada = new CompraParcelada(500.0, 5, 0.01);
		assertEquals(525, compraParcelada.total(), 1);
	}

	@Test
	public void test10Parcelas() {
		compraParcelada = new CompraParcelada(500.0, 10, 0.01);
		assertEquals(552, compraParcelada.total(), 1);
	}

	@Test
	public void test12Parcela() {
		compraParcelada = new CompraParcelada(500.0, 12, 0.01);
		assertEquals(563, compraParcelada.total(), 1);
	}

}

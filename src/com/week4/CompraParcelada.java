package com.week4;

public class CompraParcelada extends Compra {

	Integer parcelas;
	Double juros;

	public CompraParcelada(Double valor, Integer parcelas, Double juros) {
		super(valor);
		this.juros = juros;
		this.parcelas = parcelas;
	}

	@Override
	public Double total() {
		Double montante;

		montante = valor * (Math.pow((1 + juros), parcelas));

		return montante;
	}
}

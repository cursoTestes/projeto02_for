package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {

	@Test
	public void venda_100_reais_retorna_5() {
		// Arrange
		double venda = 100;
		double esperado = 5;

		// Act
		double resultado = CalculadoraComissao.calcula(venda);

		// Assert
		assertEquals(resultado, esperado,0);
	}

	@Test
	public void venda_10000_reais_retorna_500() {
		// Arrange
		double venda = 10000;
		double esperado = 500;

		// Act
		double resultado = CalculadoraComissao.calcula(venda);

		// Assert
		assertEquals(resultado, esperado,0);
	}
	
	@Test
	public void venda_99_reais_retorna_4_95() {
		// Arrange
		double venda = 99;
		double esperado = 4.95;

		// Act
		double resultado = CalculadoraComissao.calcula(venda);

		// Assert
		assertEquals(resultado, esperado, 0);
	}
}

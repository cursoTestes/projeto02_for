package br.com.k21;

public class CalculadoraComissao {

	public static double calcula(double venda) {
		
		double result;
		
		if(venda <= 10000){
			result = venda * 0.05;
		} else {
			result = venda * 0.06;
		}
		
		return result;
	}

}

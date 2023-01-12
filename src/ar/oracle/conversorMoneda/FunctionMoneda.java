package ar.oracle.conversorMoneda;

import javax.swing.JOptionPane;

public abstract class FunctionMoneda {
	
	
	public static void convertirMonedas(double valorRecibido) {
		String opcion = InterfazMoneda.elegirMoneda();
		
		realizaConversion(opcion,valorRecibido);
		
	}
	
	private static void realizaConversion(String opcion,double valorRecibido) {
		switch (opcion) {
		case "De Pesos a Dolar":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.pesoDolar, " Dolares");
			break;
		case "De Pesos a Euro":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.pesoEuro, " Euros");
			break;
		case "De Pesos a Libras":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.pesoLibra, " Libras");
			break;
			
		case "De Pesos a Yen":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.pesoYen, " Yenes");
			break;
			
		case "De Pesos a Won Coreano":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.pesoWon, " Wones");
			break;
			
		case "De Dolar a Pesos":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.dolarPeso, " Pesos");
			break;
			
		case "De Euro a Pesos":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.euroPeso, " Pesos");
			break;
			
		case "De Libras a Pesos":
			ConversorMonedas.convertirDePesos(valorRecibido, ConversorMonedas.libraPeso, " Pesos");
			break;
		}
	}
	
	
}

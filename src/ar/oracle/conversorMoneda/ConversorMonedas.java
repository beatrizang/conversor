package ar.oracle.conversorMoneda;

import javax.swing.JOptionPane;

public abstract class ConversorMonedas {
	
	public static double pesoDolar = 180.67;
	public static double pesoEuro = 194.35;
	public static double pesoLibra = 6.08;
	public static double pesoYen = 1.36;
	public static double pesoWon = 0.15;
	public static double dolarPeso = 0.0055;
	public static double euroPeso = 0.0051;
	public static double libraPeso = 0.16;
	
	
	
	public static void convertirDePesos(double valorRecibido, double conversion, String monedaNombre) {
		double moneda = valorRecibido / conversion;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + monedaNombre);
	}
	
	
	
}

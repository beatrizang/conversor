package ar.oracle.conversorTemperatura;

import javax.swing.JOptionPane;

public abstract class ConversorTemperatura {

	private static double aKelvin = 273.15;
	
	public static void convertirCelsiusAKelvin(double valorRecibido) {
		double temperatura = valorRecibido + aKelvin;
		temperatura = (double) Math.round(temperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + temperatura + " K");
	}
	
	public static void convertirKelvinACelsius(double valorRecibido) {
		double temperatura = valorRecibido - aKelvin;
		temperatura = (double) Math.round(temperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + temperatura + " °F");
	}
	
	public static void convertirCelsiusAFahrenheit(double valorRecibido) {
		double temperatura = (valorRecibido*(9/5)) + 32;
		temperatura = (double) Math.round(temperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + temperatura + " °F");
	}
	

	public static void convertirFahrenheitACelsius(double valorRecibido) {
		double temperatura = (valorRecibido - 32) *(5/9);
		temperatura = (double) Math.round(temperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Son " + temperatura + " °F");
	}
	
}

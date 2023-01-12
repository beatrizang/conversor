package ar.oracle.conversorTemperatura;

import javax.swing.JOptionPane;

import ar.oracle.ppal.Interfaz;

/**
 * Se elige de que tipo de medida a cual se debe convertir
 * @author Beatriz
 *
 */
public abstract class InterfazTemperatura {
	
	/**
	 * Elige los distintos tipos de conversiones de temperatura
	 * @return
	 */
	public static String elegirTemperatura() {
		return (JOptionPane.showInputDialog(null,
				"Elije la temperatura a convertir",
				"Monedas",
				JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] 
				{"De Celsius a Kelvin", "De Celsius a Fahrenheit", "De Kelvin a Celsius" ,"De Fahrenheit a Celsius"}, "Seleccion"))
				.toString();
	}
	
	
	/**
	 * Realiza la conversion
	 */
	public static void conversorTemperatura() {
		String input = JOptionPane.showInputDialog("Ingrese la temperatura para convertir");
		
		double valorRecibido = 0.0;
		
		try {
			valorRecibido = Double.parseDouble(input);
		}
		catch(NumberFormatException e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(null, "Valor No Valido", "Error", JOptionPane.ERROR_MESSAGE);
			Interfaz.dialogoPrincipal();
		}
		
		
		FunctionTemperatura.convertirTemperatura(valorRecibido);
		
		Interfaz.deseaContinuar();
	}
}

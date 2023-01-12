package ar.oracle.conversorMoneda;

import javax.swing.JOptionPane;


import ar.oracle.ppal.Interfaz;

public abstract class InterfazMoneda {
	
	/**
	 * Se eligen dos monedas, para convertir (Ej: De pesos a Euro, De Dolar a Pesos, etc.)
	 * @return
	 */
	public static String elegirMoneda() {
		return (JOptionPane.showInputDialog(null,
				"Elije la moneda que deseas convertir tu dinero",
				"Monedas",
				JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] 
				{"De Pesos a Euro", "De Pesos a Dolar", "De Pesos a Libras" ,"De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos","De Euro a Pesos","De Libras a Pesos"}, "Seleccion"))
				.toString();
	}
	
	/**
	 * Muestra el dialogo y realiza las conversiones de moneda
	 */
	public static void conversorMoneda() {
		String input = JOptionPane.showInputDialog("Ingrese el dinero para convertir");
		double valorRecibido = 0.0;
		
		try {
			valorRecibido = Double.parseDouble(input);
		}
		catch(NumberFormatException e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(null, "Valor No Valido", "Error", JOptionPane.ERROR_MESSAGE);
			Interfaz.dialogoPrincipal();
		}
		
		FunctionMoneda.convertirMonedas(valorRecibido);
		
		Interfaz.deseaContinuar();
	}
}

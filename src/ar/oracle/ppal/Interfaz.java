package ar.oracle.ppal;

import javax.swing.JOptionPane;

import ar.oracle.conversorMoneda.InterfazMoneda;
import ar.oracle.conversorTemperatura.InterfazTemperatura;

public abstract class Interfaz{
	
	/**
	 * Muestra el dialogo principal de el programa
	 */
	public static void dialogoPrincipal() {
		String opciones = Interfaz.elegirConversor();
		
		switch (opciones) {
		case "Conversor de Moneda":
			InterfazMoneda.conversorMoneda();
			break;
			
		case "Conversor de Temperatura":
			InterfazTemperatura.conversorTemperatura();
			break;
			
		}
	}
	
    
	
	/**
	 * Elige el tipo de conversion que desea realizar (Conversor de Moneda, Conversor de Temperatura, etc.)
	 * @return
	 */
	public static String elegirConversor() {
		return (JOptionPane.showInputDialog(null,
				"Seleccione una opcion de inversion",
				"Menu",
				JOptionPane.QUESTION_MESSAGE,
				null, 
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},"Seleccion"))
				.toString();
	}
	

	
	/**
	 * Consulta al usuario si desea continuar utilizando la aplicacion
	 */
	public static void deseaContinuar() {
		int seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
		if(JOptionPane.OK_OPTION == seleccion) {
			Interfaz.dialogoPrincipal();
		}
		else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}
	
	
}

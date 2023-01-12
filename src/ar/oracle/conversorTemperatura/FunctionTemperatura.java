package ar.oracle.conversorTemperatura;

public abstract class FunctionTemperatura {

	public static void convertirTemperatura(double valorRecibido) {
		String opcion = InterfazTemperatura.elegirTemperatura();
		
		realizaConversion(opcion,valorRecibido);
		
	}
	
	private static void realizaConversion(String opcion,double valorRecibido) {
		switch (opcion) {
		case "De Celsius a Kelvin":
			ConversorTemperatura.convertirCelsiusAKelvin(valorRecibido);
			break;
		case "De Celsius a Fahrenheit":
			ConversorTemperatura.convertirCelsiusAFahrenheit(valorRecibido);
			break;
		case "De Kelvin a Celsius":
			ConversorTemperatura.convertirKelvinACelsius(valorRecibido);
			break;
			
		case "De Fahrenheit a Celsius":
			ConversorTemperatura.convertirFahrenheitACelsius(valorRecibido);
			break;
			
		}
	}
}

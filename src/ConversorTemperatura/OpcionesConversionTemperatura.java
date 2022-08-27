package ConversorTemperatura;

import javax.swing.JOptionPane;



public class OpcionesConversionTemperatura {
	
	ConvertirTemperaturas temperatura = new ConvertirTemperaturas();
	
	
	public void ConvertirTemperaturas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la Temperaturas que quieras Convertir ",  "Temperaturas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
							"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine", "De Rankine a Celsius", "De Rankine a Fahrenheit", "De Rankine a Kelvin"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Celsius a Fahrenheit":
		temperatura.ConvertirCelsiusFahrenheit(valor);
		break;
	
	case "De Celsius a Kelvin": 
		temperatura.ConvertirCelisusKelvin(valor);
		break;
		
	case "De Celsius a Rankine":
		temperatura.ConvertirCelsiusRankine(valor);
		break;
		
	case "De Fahrenheit a Celsius":
		temperatura.ConvertirFahrenheitCelsius(valor);
		break;
		
	case "De Fahrenheit a Kelvin":
		temperatura.ConvertirFahrenheitKelvin(valor);
		break;
	
	case "De Fahrenheit a Rankine":
		temperatura.ConvertirFahrenheitRankine(valor);
		break;
		
	case "De Kelvin a Celsius":
		temperatura.ConvertirKelvinCelsius(valor);
		break;
		
	case "De Kelvin a Fahrenheit":
		temperatura.ConvertirKelvinFahrenheit(valor);
		break;
	 
	case "De Kelvin a Rankine":
		temperatura.ConvertirKelvinRankine(valor);
		break;
		
	case "De Rankine a Celsius":
		temperatura.ConvertirRankineCelsius(valor);
		break;
		
	case "De Rankine a Fahrenheit":
		temperatura.ConvertirRankineFahrenheit(valor);
		break;
		
	case "De Rankine a Kelvin":
		temperatura.ConvertirRankineKelvin(valor);
		break;
	}
	}
	}




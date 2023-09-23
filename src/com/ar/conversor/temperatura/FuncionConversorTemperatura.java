package com.ar.conversor.temperatura;

import javax.swing.JOptionPane;

public class FuncionConversorTemperatura {
	ConversorTemperatura temp = new ConversorTemperatura();
	public void ConvertirTemp(double mInput) {
		String opcion =  (JOptionPane.showInputDialog(null, "Elija de que temperatura a que temperatura deseas convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Celcius a Fahrenheit", "Celcius a Kelvin",
				"Fahrenheit a Celcius", "Fahrenheit a Kelvin",
				"Kelvin a Celcius", "Kelvin a Fahrenheit"},
				"Seleccion")).toString();
				
		switch(opcion) {
		case "Celcius a Fahrenheit":
			temp.ConvertirCelciusAFahrenheit(mInput);
			break;
		
		case "Celcius a Kelvin":
			temp.ConvertirCelciusAKelvin(mInput);
			break;
		
		case "Fahrenheit a Celcius":
			temp.ConvertirFahrenheitACelcius(mInput);
			break;
			
		case "Fahrenheit a Kelvin":
			temp.ConvertirFahrenheitAKelvin(mInput);
			break;
			
		case "Kelvin a Celcius":
			temp.ConvertirKelvinACelcius(mInput);
			break;
			
		case "Kelvin a Fahrenheit":
			temp.ConvertirKelvinAFahrenheit(mInput);
			break;
		}
	}
}

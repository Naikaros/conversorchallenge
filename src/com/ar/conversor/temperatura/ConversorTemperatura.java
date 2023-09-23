package com.ar.conversor.temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	public void ConvertirCelciusAFahrenheit(double valor) {
		double tF =  (valor*9/5) + 32;
		tF = (double) Math.round(tF * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son: " + tF + "°F");
	}
	
	public void ConvertirCelciusAKelvin(double valor) {
		double tK =  valor + 273.15;
		tK = (double) Math.round(tK * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son: " + tK + "K");
	}
	
	public void ConvertirFahrenheitACelcius(double valor) {
		double tC =  (valor - 32) * 5/9 ;
		tC = (double) Math.round(tC * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son: " + tC + "K");
	}
	
	public void ConvertirFahrenheitAKelvin(double valor) {
		double tK =  (valor - 32) * 5/9 + 273.15;
		tK = (double) Math.round(tK * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son: " + tK + "K");
	}
	
	public void ConvertirKelvinACelcius(double valor) {
		double tC =  valor - 273.15;
		tC = (double) Math.round(tC * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son: " + tC + "K");
	}
	
	public void ConvertirKelvinAFahrenheit(double valor) {
		double tF =  (valor - 273.15) * 9/5 + 32;
		tF = (double) Math.round(tF * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son: " + tF + "K");
	}
}

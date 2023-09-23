package com.ar.principal;

import javax.swing.JOptionPane;

import com.ar.conversor.moneda.FuncionConversorMonedas;
import com.ar.conversor.temperatura.FuncionConversorTemperatura;

public class Principal {
	public static void main(String[] args) {
		FuncionConversorMonedas monedas = new FuncionConversorMonedas();
		FuncionConversorTemperatura temp = new FuncionConversorTemperatura();
		
		boolean mantenerFuncionando = true;
		
		while(mantenerFuncionando) {
			
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversor", "Menu", JOptionPane.QUESTION_MESSAGE, null,
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Seleccion")).toString();
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir: ");
				if(ValidarNumero(input)) {
					double mInput = Double.parseDouble(input);
					monedas.ConvertirMonedas(mInput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Afirmativo");
					} else {
						mantenerFuncionando = false;
						JOptionPane.showMessageDialog(null, "Muchas gracias por usar el conversor");
					}
				}
				
			case "Conversor de Temperatura":
				String iTemp = JOptionPane.showInputDialog("Ingrese la cantidad de temperatura a convertir: ");
				if(ValidarNumero(iTemp)) {
					double tInput = Double.parseDouble(iTemp);
					temp.ConvertirTemp(tInput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Afirmativo");
					} else {
						mantenerFuncionando = false;
						JOptionPane.showMessageDialog(null, "Muchas gracias por usar el conversor");
					}
				}
			}
		}
	}

	private static boolean ValidarNumero(String input) {
		try {
			double x =  Double.parseDouble(input);
			if(x >= 0 || x < 0);
			return true;
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Solo se permiten caracteres numericos", "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}

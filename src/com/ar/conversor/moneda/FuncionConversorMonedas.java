package com.ar.conversor.moneda;

import javax.swing.JOptionPane;

public class FuncionConversorMonedas {
	ConversorMonedas monedas = new ConversorMonedas();
	public void ConvertirMonedas(double mInput) {
		String opcion =  (JOptionPane.showInputDialog(null, "Elija cual es tu moneda y a que deseas convertir", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Pesos a Dolar", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen Japones", "Pesos a Won Sur Coreano",
				"Dolar a Pesos", "Dolar a Euros", "Dolar a Libras Esterlinas", "Dolar a Yen Japones", "Dolar a Won Sur Coreano", 
				"Euros a Pesos", "Euros a Dolar", "Euros a Libras Esterlinas", "Euros a Yen Japones", "Euros a Won Sur Coreano", 
				"Libras Esterlinas a pesos", "Libras Esterlinas a Dolar", "Libras Esterlinas a Euros", "Libras Esterlinas a Yen Japones", "Libras Esterlinas a Won Sur Coreano",
				"Yen Japones a Pesos", "Yen Japones a Dolar", "Yen Japones a Euros", "Yen Japones a Dolar", "Yen Japones a Won Sur Coreano", 
				"Won Sur Coreano a Pesos", "Won Sur Coreano a Dolar", "Won Sur Coreano a Euros", "Won Sur Coreano a Dolar", "Won Sur Coreano a Yen Japones"},
				"Seleccion")).toString();
		switch(opcion) {
		case "Pesos a Dolar":
			monedas.ConvertirPesosADolar(mInput);
			break;
			
		case "Pesos a Euros":
			monedas.ConvertirPesosAEuro(mInput);
			break;
			
		case "Pesos a Libras Esterlinas":
			monedas.ConvertirPesosALibras(mInput);
			break;
		case "Pesos a Yen Japones":
			monedas.ConvertirPesosAYenJapones(mInput);
			break;
	
		case "Pesos a Won Sur Coreano":
			monedas.ConvertirPesosAWonSurCoreano(mInput);
			break;
	
		case "Dolar a Pesos":
			monedas.ConvertirDolarAPesos(mInput);
			break;
	
		case "Dolar a Euros":
			monedas.ConvertirDolarAEuro(mInput);
			break;
	
		case "Dolar a Lirbas Esterlinas":
			monedas.ConvertirDolarALibras(mInput);
			break;
	
		case "Dolar a Yen Japones":
			monedas.ConvertirDolarAYenJapones(mInput);
			break;
	
		case "Dolar a Won Sur Coreano":
			monedas.ConvertirDolarAWonSurCoreano(mInput);
			break;
	
		case "Euros a Pesos":
			monedas.ConvertirEuroAPesos(mInput);
			break;
	
		case "Euros a Dolar":
			monedas.ConvertirEuroADolar(mInput);
			break;
	
		case "Euros a Libras Esterlinas":
			monedas.ConvertirEuroALibrasEsterlinas(mInput);
			break;
	
		case "Euros a Yen Japones":
			monedas.ConvertirEuroAYenJapones(mInput);
			break;
	
		case "Euros a Won Sur Coreano":
			monedas.ConvertirEuroAWonSurCoreano(mInput);
			break;
	
		case "Libras Esterlinas a Pesos":
			monedas.ConvertirLibrasEsterlinasAPesos(mInput);
			break;
	
		case "Libras Esterlinas a Dolar":
			monedas.ConvertirLibrasEsterlinasADolar(mInput);
			break;
	
		case "Libras Esterlinas a Euro":
			monedas.ConvertirLibrasEsterlinasAEuro(mInput);
			break;
	
		case "Libras Esterlinas a Yen Japones":
			monedas.ConvertirLibrasEsterlinasAYenJapones(mInput);
			break;
	
		case "Libras Esterlinas a Won Sur Coreano":
			monedas.ConvertirLibrasEsterlinasAWonSurCoreano(mInput);
			break;
			
		case "Yen Japones a Pesos":
			monedas.ConvertirYenJaponesAPesos(mInput);
			break;
			
		case "Yen Japones a Dolar":
			monedas.ConvertirYenJaponesADolar(mInput);
			break;
			
		case "Yen Japones a Euro":
			monedas.ConvertirYenJaponesAEuro(mInput);
			break;
			
		case "Yen Japones a Libras Esterlinas":
			monedas.ConvertirYenJaponesALibrasEsterlinas(mInput);
			break;
			
		case "Yen Japones a Won Sur Coreano":
			monedas.ConvertirYenJaponesAWonSurCoreano(mInput);
			break;
			
		case "Won Sur Coreano a Pesos":
			monedas.ConvertirWonSurcoreanoAPesos(mInput);
			break;
		
		case "Won Sur Coreano a Dolar":
			monedas.ConvertirWonSurcoreanoADolar(mInput);
			break;
			
		case "Won Sur Coreano a Euro":
			monedas.ConvertirWonSurcoreanoAEuro(mInput);
			break;
			
		case "Won Sur Coreano a Libras Esterlinas":
			monedas.ConvertirWonSurcoreanoALibrasEsterlinas(mInput);
			break;
			
		case "Won Sur Coreano a Yen Japones":
			monedas.ConvertirWonSurcoreanoAYenJapones(mInput);
			break;
		}
	}
}

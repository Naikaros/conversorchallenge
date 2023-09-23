package com.ar.conversor.moneda;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	public void ConvertirPesosADolar(double valor) {
		double mDolar =  valor * 0.0038;
		mDolar = (double) Math.round(mDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mDolar + " Dolares");
	}
	
	public void ConvertirPesosAEuro(double valor) {
		double mEuro =  valor * 0.0035;
		mEuro = (double) Math.round(mEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mEuro + " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double mLibra =  valor * 0.003;
		mLibra = (double) Math.round(mLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mLibra + " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYenJapones(double valor) {
		double mYen =  valor * 0.55;
		mYen = (double) Math.round(mYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mYen + " Yenes");
	}
	
	public void ConvertirPesosAWonSurCoreano(double valor) {
		double mWon =  valor * 5.02;
		mWon = (double) Math.round(mWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mWon + " Wones");
	}
	
	public void ConvertirDolarAPesos(double valor) {
		double mPesos = valor * 260.36;
		mPesos = (double) Math.round(mPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mPesos + " Pesos Argentinos");
	}
	
	public void ConvertirDolarAEuro(double valor) {
		double mEuro = valor * 0.92;
		mEuro = (double) Math.round(mEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mEuro + " Euros");
	}
	
	public void ConvertirDolarALibras(double valor) {
		double mLibra = valor * 0.78;
		mLibra = (double) Math.round(mLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mLibra + " Libras Esterlinas");
	}
	
	public void ConvertirDolarAYenJapones(double valor) {
		double mYen = valor * 143.12;
		mYen = (double) Math.round(mYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mYen + " Yenes");
	}
	
	public void ConvertirDolarAWonSurCoreano(double valor) {
		double mWon = valor * 1306.21;
		mWon = (double) Math.round(mWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mWon + " Wones");
	}
	
	public void ConvertirEuroAPesos(double valor) {
		double mPesos = valor * 283.43;
		mPesos = (double) Math.round(mPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mPesos + " Pesos Argentinos");
	}
	
	public void ConvertirEuroADolar(double valor) {
		double mDolar = valor * 1.09;
		mDolar = (double) Math.round(mDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mDolar + " Dolares");
	}
	
	public void ConvertirEuroALibrasEsterlinas(double valor) {
		double mLibra = valor * 0.85;
		mLibra = (double) Math.round(mLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mLibra + " Libras Esterlinas");
	}
	
	public void ConvertirEuroAYenJapones(double valor) {
		double mYen = valor * 155.78;
		mYen = (double) Math.round(mYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mYen + " Yenes");
	}
	
	public void ConvertirEuroAWonSurCoreano(double valor) {
		double mWon = valor * 1421.28;
		mWon = (double) Math.round(mWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mWon + " Wones");
	}
	
	public void ConvertirLibrasEsterlinasAPesos(double valor) {
		double mPesos = valor * 332.27;
		mPesos = (double) Math.round(mPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mPesos + " Pesos Argentinos");
	}
	
	public void ConvertirLibrasEsterlinasADolar(double valor) {
		double mDolar = valor * 1.28;
		mDolar = (double) Math.round(mDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mDolar + " Dolares");
	}
	
	public void ConvertirLibrasEsterlinasAEuro(double valor) {
		double mEuro = valor * 1.17;
		mEuro = (double) Math.round(mEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mEuro + " Euros");
	}
	
	public void ConvertirLibrasEsterlinasAYenJapones(double valor) {
		double mYen = valor * 182.63;
		mYen = (double) Math.round(mYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mYen + " Yenes");
	}
	
	public void ConvertirLibrasEsterlinasAWonSurCoreano(double valor) {
		double mWon = valor * 1667.18;
		mWon = (double) Math.round(mWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mWon + " Wones");
	}
	
	public void ConvertirYenJaponesAPesos(double valor) {
		double mPesos = valor * 1.82;
		mPesos = (double) Math.round(mPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mPesos + " Pesos Argentinos");
	}
	
	public void ConvertirYenJaponesADolar(double valor) {
		double mDolar = valor * 0.007;
		mDolar = (double) Math.round(mDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mDolar + " Dolares");
	}
	
	public void ConvertirYenJaponesAEuro(double valor) {
		double mEuro = valor * 0.0064;
		mEuro = (double) Math.round(mEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mEuro + " Euros");
	}
	
	public void ConvertirYenJaponesALibrasEsterlinas(double valor) {
		double mLibra = valor * 0.0055;
		mLibra = (double) Math.round(mLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mLibra + " Libras Esterlinas");
	}
	
	public void ConvertirYenJaponesAWonSurCoreano(double valor) {
		double mWon = valor * 9.13;
		mWon = (double) Math.round(mWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mWon + " Wones");
	}
	
	public void ConvertirWonSurcoreanoAPesos(double valor) {
		double mPesos = valor * 0.2;
		mPesos = (double) Math.round(mPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mPesos + " Pesos Argentinos");
	}
	
	public void ConvertirWonSurcoreanoADolar(double valor) {
		double mDolar = valor * 0.00077;
		mDolar = (double) Math.round(mDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mDolar + " Dolar");
	}
	
	public void ConvertirWonSurcoreanoAEuro(double valor) {
		double mEuro = valor * 0.0007;
		mEuro = (double) Math.round(mEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mEuro + " Euros");
	}
	
	public void ConvertirWonSurcoreanoALibrasEsterlinas(double valor) {
		double mLibra = valor * 0.0006;
		mLibra = (double) Math.round(mLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mLibra + " Libras Esterlinas");
	}
	
	public void ConvertirWonSurcoreanoAYenJapones(double valor) {
		double mYen = valor * 0.11;
		mYen = (double) Math.round(mYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + mYen + " Yenes");
	}
}

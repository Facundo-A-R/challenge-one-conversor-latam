package operaciones_de_temperaturas;

import javax.swing.JOptionPane;

public class OperacionesTemperaturas {

	public double ConvertirCelciusAFarenheit(double valorCelcius) {
		double farenheit = valorCelcius * 1.8 + 32;
		farenheit = (double) Math.round(farenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valorCelcius + " Grados Celcius son " + farenheit + " Grados Farenheit ");
		return farenheit;
	}

	public double ConvertirFarenheitACelcius(double valorFarenheit) {
		double celcius = (valorFarenheit - 32) / 1.8;
		celcius = (double) Math.round(celcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valorFarenheit + " Grados Farenheit son " + celcius + " Celcius");
		return celcius;
	}

}

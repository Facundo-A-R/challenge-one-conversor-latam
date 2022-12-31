package operaciones_cambio_de_monedas;
import javax.swing.JOptionPane;

/**
 * Pesos a dolar divido.
 * dolar a peso multiplico.
 */

public class OperacionesMoneda {
	
	
	public void convertirDePesosADolar(double valorPeso) {
		double valorDolar = valorPeso / 173.95;
		valorDolar = (double) Math.round(valorDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de $" + valorPeso + " Pesos Argentinos, a Dolar UST es: $" + valorDolar + " Dolar UST");
	}
	
	public void convertirDeDolarAPesos(double valorDolar) {
		double valorPesos = valorDolar * 173.95;
		valorPesos = (double) Math.round(valorPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de $" + valorDolar + " Dolar UST, a pesos Argentinos es: $" + valorPesos + " Pesos Argrntinos");
	}
	
	public void convertirDePesosAEuros(double valorPeso) {
		double valorEuros = valorPeso / 185.54;
		valorEuros = (double) Math.round(valorEuros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de $" + valorPeso + " Pesos Argentinos, a Euros es: €" + valorEuros + " Euros");
	}
	
	public void convertirDeEurosAPesos(double valorEuros) {
		double valorPesos = valorEuros * 185.54;
		valorPesos = (double) Math.round(valorPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de €" + valorEuros + " Euros, a Pesos Argentinos es: $" + valorPesos + " Pesos Argrntinos");
	}
}

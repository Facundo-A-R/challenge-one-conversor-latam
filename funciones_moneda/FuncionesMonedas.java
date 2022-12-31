package funciones_moneda;

import javax.swing.JOptionPane;

import operaciones_cambio_de_monedas.OperacionesMoneda;
import utilitarios.Utilitarios;

public class FuncionesMonedas implements Utilitarios {

	public void conversorDeMonedas(double valorRecivido) {

		OperacionesMoneda moneda = new OperacionesMoneda();

		String menuConversor = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion de moneda",
				"Menu Conversor", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Convertir de Pesos Arg a Dolar UST", "Convertir de Dolar UST a Pesos Arg",
						"Convertir de Pesos Arg a Euros", "Convertir de Euros a Pesos Arg" },
				"Convertir de Pesos Arg a Dolar UST").toString();

		switch (menuConversor) {

		case "Convertir de Pesos Arg a Dolar UST":
			moneda.convertirDePesosADolar(valorRecivido);
			break;
		case "Convertir de Dolar UST a Pesos Arg":
			moneda.convertirDeDolarAPesos(valorRecivido);
			break;
		case "Convertir de Pesos Arg a Euros":
			moneda.convertirDePesosAEuros(valorRecivido);
			break;
		case "Convertir de Euros a Pesos Arg":
			moneda.convertirDeEurosAPesos(valorRecivido);
			break;
		}

	}
	
	@Override
	public boolean validarEntrada(String inputEntrada) {
		try {
			double valorEntrada = Double.parseDouble(inputEntrada);
			if (valorEntrada >= 0 || valorEntrada < 0)
				;

			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	@Override
	public boolean validarEntrada(String inputEntrada1, String inputEntrada2) {
		return false;
	}

}

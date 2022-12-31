package funciones_temperatura;

import javax.swing.JOptionPane;

import operaciones_de_temperaturas.OperacionesTemperaturas;
import utilitarios.Utilitarios;

public class FuncionesTemperatura implements Utilitarios {

	public void conversorDeTemperaturas(double valorRecivido) {

		OperacionesTemperaturas temperatura = new OperacionesTemperaturas();

		String menuTemperatura = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion de temperatura",
				"Menu Temperatura", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Convertir de Celcius a Farenheit", "Convertir de Farenheit a Celcius" },
				"Convertir de Farenheit a Celcius").toString();

		switch (menuTemperatura) {

		case "Convertir de Celcius a Farenheit":
			temperatura.ConvertirCelciusAFarenheit(valorRecivido);
			break;
		case "Convertir de Farenheit a Celcius":
			temperatura.ConvertirFarenheitACelcius(valorRecivido);
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

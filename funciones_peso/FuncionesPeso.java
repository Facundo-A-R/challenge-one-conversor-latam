package funciones_peso;

import javax.swing.JOptionPane;

import operaciones_de_peso.OperacionesPeso;
import utilitarios.Utilitarios;

public class FuncionesPeso implements Utilitarios {

	public void conversorDePeso(double valorRecivido) {

		OperacionesPeso peso = new OperacionesPeso();

		String menuTemperatura = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion de peso",
				"Menu Peso", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Convertir de Kilos a Toneladas", "Convertir de Toneladas a Kilos",
						"Convertir de Kilos a Libras", "Convertir de Libras a Kilos", "Convertir de Libras a Toneladas",
						"Convertir de Toneladas a Libras" },
				"Convertir de Toneladas a Libras").toString();

		switch (menuTemperatura) {

		case "Convertir de Kilos a Toneladas":
			peso.convertirDeKilosAToneladas(valorRecivido);
			break;
		case "Convertir de Toneladas a Kilos":
			peso.convertirDeToneladasAKilos(valorRecivido);
			break;
		case "Convertir de Kilos a Libras":
			peso.convertirDeKilosALibras(valorRecivido);
			break;
		case "Convertir de Libras a Kilos":
			peso.convertirDeLibrasAKilos(valorRecivido);
			break;
		case "Convertir de Libras a Toneladas":
			peso.convertirDeLibrasAToneladas(valorRecivido);
			break;
		case "Convertir de Toneladas a Libras":
			peso.convertirDeToneladasALibras(valorRecivido);
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

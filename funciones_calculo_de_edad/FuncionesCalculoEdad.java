package funciones_calculo_de_edad;

import javax.swing.JOptionPane;

import operaciones_calculo_de_edad.OperacionesCalculoEdad;
import utilitarios.Utilitarios;

public class FuncionesCalculoEdad implements Utilitarios {
	
	public void calcularEdad(int anhoActual, int anhoNacimiento) {
		
		OperacionesCalculoEdad calculoEdad = new OperacionesCalculoEdad();
		
		String datosPersona = JOptionPane.showInputDialog(null, "Ingrese los datos solicitados a continuacion:",
				"Datos Persona", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Calcula tu Edad" }, "Calcula tu Edad").toString();
		
		switch (datosPersona) {

		case "Calcula tu Edad":	
			calculoEdad.calcularEdad(anhoActual, anhoNacimiento);
			break;
		}

	}

	@Override
	public boolean validarEntrada(String inputEntrada1, String inputEntrada2) {
		try {
			int valorEntrada1 = Integer.parseInt(inputEntrada1);
			int valorEntrada2 = Integer.parseInt(inputEntrada2);
			if ((valorEntrada1 >= 0 || valorEntrada1 < 0) && (valorEntrada2 >= 0 || valorEntrada2 < 0))
				;

			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	@Override
	public boolean validarEntrada(String inputEntrada) {
		return false;
	}
}

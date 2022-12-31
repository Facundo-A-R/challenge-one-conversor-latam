package operaciones_calculo_de_edad;

import javax.swing.JOptionPane;

public class OperacionesCalculoEdad {

	public int calcularEdad(int valorAnhoActual, int valorAnhoNacimiento) {
		
		int edadCalculada = (valorAnhoActual - valorAnhoNacimiento);
		JOptionPane.showMessageDialog(null, "Tu edad a la fecha es: " + edadCalculada);
		return edadCalculada;
	}

}

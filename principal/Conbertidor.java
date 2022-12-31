package principal;

import javax.swing.JOptionPane;

import funciones_calculo_de_edad.FuncionesCalculoEdad;
import funciones_moneda.FuncionesMonedas;
import funciones_peso.FuncionesPeso;
import funciones_temperatura.FuncionesTemperatura;

public class Conbertidor {

	public static void main(String[] args) {

		FuncionesMonedas funcionesMonedas = new FuncionesMonedas();
		FuncionesTemperatura funcionesTemperaturas = new FuncionesTemperatura();
		FuncionesPeso funcionesPeso = new FuncionesPeso();

		FuncionesCalculoEdad funcionesCalculoEdad = new FuncionesCalculoEdad();

		try {
			String menu;
			String valorInput;
			int respuestaMenu = JOptionPane.YES_OPTION;

			do {

				menu = JOptionPane
						.showInputDialog(null, "Seleccione una opcion", "Menu Principal", JOptionPane.QUESTION_MESSAGE,
								null,
								new Object[] { "Conversor de Monedas", "Conversor de Temperaturas",
										"Conversor de Unidades de Peso", "Calculo de Edad" },
								"Calculo de Edad")
						.toString();

				switch (menu) {

				case "Conversor de Monedas":

					double valorMoneda;
					int respuestaMoneda = JOptionPane.YES_OPTION;

					while (JOptionPane.YES_OPTION == respuestaMoneda) {

						valorInput = JOptionPane.showInputDialog("¿ Ingrese el valor a Convertir ?");

						if (funcionesMonedas.validarEntrada(valorInput)) {
							valorMoneda = Double.parseDouble(valorInput);
							funcionesMonedas.conversorDeMonedas(valorMoneda);

						} else {
							JOptionPane.showInternalMessageDialog(null,
									"El valor ingresado no es un numero, ingrese solo numeros", valorInput,
									JOptionPane.PLAIN_MESSAGE);
						}

						respuestaMoneda = JOptionPane.showConfirmDialog(null,
								"¿ Deseas realizar otra conversión de monedas ?");

						try {
							if (JOptionPane.YES_OPTION != respuestaMoneda) {
								JOptionPane.showMessageDialog(null, "Gracias, volvera al menu principal");
								// respuestaMenu = JOptionPane.YES_OPTION;
							}
						} catch (NullPointerException e) { // e.getMessage();
							JOptionPane.showMessageDialog(null, "Gracias");
						}

					}

					break;

				case "Conversor de Temperaturas":

					double valorTemperatura;
					int respuestaTemperatura = JOptionPane.YES_OPTION;

					while (JOptionPane.YES_OPTION == respuestaTemperatura) {

						valorInput = JOptionPane.showInputDialog("¿ Ingrese la temperatura que desea Convertir ?");

						if (funcionesTemperaturas.validarEntrada(valorInput)) {
							valorTemperatura = Double.parseDouble(valorInput);
							funcionesTemperaturas.conversorDeTemperaturas(valorTemperatura);

						} else {
							JOptionPane.showInternalMessageDialog(null,
									"El valor ingresado no es un numero, ingrese solo numeros", valorInput,
									JOptionPane.PLAIN_MESSAGE);
						}

						respuestaTemperatura = JOptionPane.showConfirmDialog(null,
								"¿ Deseas realizar otra conversión de temperatura ?");

						try {
							if (JOptionPane.YES_OPTION != respuestaTemperatura) {
								JOptionPane.showMessageDialog(null, "Gracias, volvera al menu principal");
								// respuestaMenu = JOptionPane.YES_OPTION;
							}
						} catch (NullPointerException e) { // e.getMessage();
							JOptionPane.showMessageDialog(null, "Gracias");
						}

					}

					break;

				case "Conversor de Unidades de Peso":

					double valorPeso;
					int respuestaPeso = JOptionPane.YES_OPTION;

					while (JOptionPane.YES_OPTION == respuestaPeso) {

						valorInput = JOptionPane.showInputDialog("¿ Ingrese el peso que desea Convertir ?");

						if (funcionesPeso.validarEntrada(valorInput)) {
							valorPeso = Double.parseDouble(valorInput);
							funcionesPeso.conversorDePeso(valorPeso);

						} else {
							JOptionPane.showInternalMessageDialog(null,
									"El valor ingresado no es un numero, ingrese solo numeros", valorInput,
									JOptionPane.PLAIN_MESSAGE);
						}

						respuestaPeso = JOptionPane.showConfirmDialog(null,
								"¿ Deseas realizar otra conversión de peso ?");

						try {
							if (JOptionPane.YES_OPTION != respuestaPeso) {
								JOptionPane.showMessageDialog(null, "Gracias, volvera al menu principal");
								// respuestaMenu = JOptionPane.YES_OPTION;
							}
						} catch (NullPointerException e) { // e.getMessage();
							JOptionPane.showMessageDialog(null, "Gracias");
						}

					}

					break;

				case "Calculo de Edad":

					int valorInput1, valorInput2;
					int respuestaEdad = JOptionPane.YES_OPTION;

					while (JOptionPane.YES_OPTION == respuestaEdad) {

						String input1 = JOptionPane.showInputDialog("¿ Ingrese el año actual ?");
						String input2 = JOptionPane.showInputDialog("¿ Ingrese el año en que nacio ?");
						
						if (funcionesCalculoEdad.validarEntrada(input1, input2)) {
							valorInput1 = Integer.parseInt(input1);
							valorInput2 = Integer.parseInt(input2);
							funcionesCalculoEdad.calcularEdad(valorInput1, valorInput2);

						} else {
							JOptionPane.showInternalMessageDialog(null,
									"Uno de los valores ingresados no es un numero, ingrese solo numeros", "Valor 1: " + input1 + " Valor 2: " + input2,
									JOptionPane.PLAIN_MESSAGE);
						}

						
						respuestaEdad = JOptionPane.showConfirmDialog(null,
								"¿ Deseas realizar otra calculo de la edad ?");

						try {
							if (JOptionPane.YES_OPTION != respuestaEdad) {
								JOptionPane.showMessageDialog(null, "Gracias, volvera al menu principal");
								// respuestaMenu = JOptionPane.YES_OPTION;
							}
						} catch (NullPointerException e) { // e.getMessage();
							JOptionPane.showMessageDialog(null, "Gracias");
						}

					}

					break;

				}

			} while (JOptionPane.YES_OPTION == respuestaMenu);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Gracias por usar nuestro Conversor");
		}

	}
}

package operaciones_de_peso;

import javax.swing.JOptionPane;

public class OperacionesPeso {
	
	public double convertirDeKilosAToneladas(double valorKilos) {
		double valorToneladas = valorKilos / 1000;
		//valorToneladas = (double) Math.round(valorToneladas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de " + valorKilos + "Kg. a toneladas es: " + valorToneladas + " Tn.");
		return valorToneladas;
	}

	public double convertirDeToneladasAKilos(double valorToneladas) {
		double valorKilos = valorToneladas * 1000;
		//valorToneladas = (double) Math.round(valorToneladas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de " + valorToneladas + "Tn. a kilos es: " + valorKilos + " Kg.");
		return valorKilos;
	}

	public double convertirDeKilosALibras(double valorKilos) {
		double valorLibras = valorKilos * 2.205;
		//valorToneladas = (double) Math.round(valorToneladas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de " + valorKilos + "Kg. a libra es: " + valorLibras + " Lb.");
		return valorLibras;
	}
	
	public double convertirDeLibrasAKilos(double valorLibras) {
		double valorKilos = valorLibras / 2.205;
		//valorToneladas = (double) Math.round(valorToneladas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de " + valorLibras + "Lb. a kilos es: " + valorKilos + " Kg.");
		return valorKilos;
	}
	
	public double convertirDeLibrasAToneladas(double valorLibras) {
		double valorToneladas = valorLibras / 2205;
		//valorToneladas = (double) Math.round(valorToneladas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de " + valorLibras + "Lb. a toneladas es: " + valorToneladas + " Tn.");
		return valorToneladas;
	}
	
	public double convertirDeToneladasALibras(double valorToneladas) {
		double valorLibras = valorToneladas / 2205;
		//valorToneladas = (double) Math.round(valorToneladas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tu conversion de " + valorToneladas + "Tn. a libras es: " + valorLibras + " Lb.");
		return valorLibras;
	}
}

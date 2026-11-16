import java.util.HashMap;

public class Electrodomestico {
	private String modelo = "Desconocido";
	private double precioBase = 100;
	public char consumoEnergetico = 'F';
	private double peso = 5;
	
	public static int totalElectrodomesticos = 0;
	static HashMap<Character, Integer> consumo = new HashMap<>();
	
	static { //Static se va a ejecutar una vez cuando se llame a la clase
		rellenarConsumo();
	}

	public static void rellenarConsumo() {
		consumo.put('A', 100);
		consumo.put('B', 80);
        consumo.put('C', 60);
        consumo.put('D', 50);
        consumo.put('E', 30);
        consumo.put('F', 10);
	}
	
}

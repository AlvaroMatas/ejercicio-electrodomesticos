import java.util.HashMap;

public class Electrodomestico {
	private String modelo = "Desconocido";
	private double precioBase = 100;
	private static final char consumoEnergeticoPorDefecto = 'F';
	public char consumoEnergetico = consumoEnergeticoPorDefecto;
	private double peso = 5;
	
	public static int totalElectrodomesticos = 0;
	static HashMap<Character, Integer> consumo = new HashMap<>();
	
	static { //Static se va a ejecutar una vez cuando se llame a la clase
		rellenarLetras();
	}
	
	//Constructores
	public Electrodomestico() {
		super();
	}

	public Electrodomestico(String modelo, double precioBase, char consumoEnergetico, double peso) {
		super();
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	//Metodo para rellenar las letras
	public static void rellenarLetras() {
		consumo.put('A', 100);
		consumo.put('B', 80);
        consumo.put('C', 60);
        consumo.put('D', 50);
        consumo.put('E', 30);
        consumo.put('F', 10);
	}
	
	//Metodo para comprobar que el consumo esté entre la A y la F
	private char comprobarConsumoEnergetico(char consumoEnergetico2) {
		char letra = consumoEnergeticoPorDefecto;
		
		if (consumoEnergetico2 >= 'A' && consumoEnergetico2 <= 'F') {
			letra = consumoEnergetico2;
		}
		
		return letra;
	}
	
	//getters y setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static int getTotalElectrodomesticos() {
		return totalElectrodomesticos;
	}
	
	
}

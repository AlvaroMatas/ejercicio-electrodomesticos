
public final class Lavadora extends Electrodomestico{
	//final para que no se pueda heredar de ella (para que no tenga subclases)
	
	private double carga = 5;
	
	//Constructores
	public Lavadora() {
		super();
		
		totalElectrodomesticos++;
	}

	public Lavadora(String modelo, double precioBase, char consumoEnergetico, double peso, double carga) {
		super(modelo, precioBase, consumoEnergetico, peso);
		this.carga = carga;
		
		totalElectrodomesticos++;
	}
	
	//Constructor de copia
	public Lavadora(Lavadora copia) {
		this(copia.getModelo(), copia.getPrecioBase(), copia.getConsumoEnergetico(), copia.getPeso(), copia.carga);
	}
}

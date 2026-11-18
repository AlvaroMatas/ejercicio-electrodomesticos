
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
	
	//Metodo para devolver el precio final de la lavadora
	public double precioFinal() {
		/*  devuelve el precio final de venta, teniendo en cuenta que al
		precio base se le deben aplicar los incrementos de la clase Electrodoméstico más
		el incremento propio de esta clase, que es el siguiente:
		➢ si tiene una carga mayor de 30 kg, se aumenta el precio 50 €, si no es así, no
		se incrementa el precio */
		
		double precioFinal = getPrecioBase() + incrementoPrecio();
		
		if (carga > 30) {
			precioFinal += 50;
		}
		
		return precioFinal;
	}

	//Metodo toString para mostrar el contenido 
	@Override
	public String toString() {
		return super.toString() + "*****Lavadora***** \n"
				+ "Carga: " + carga;
	}
	
	
}

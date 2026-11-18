import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tienda {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Lavadora> lavadoras = new ArrayList<Lavadora>();
	
	public static void main(String[] args) throws IOException {
		int opcion = 0;
		
		do {
			System.out.println("*****Tienda***** \n"
					+ "[1] Agregar una lavadora \n"
					+ "[2] Buscar lavadora por modelo \n"
					+ "[3] Modificar precio base de lavadora (Decir modelo) \n"
					+ "[4] Eliminar lavadora (Decir modelo) \n"
					+ "[5] Mostrar todas las lavadoras \n"
					+ "[6] Salir");
			
			opcion = pedirOpcion();
		} while (opcion != 6);

	}

	//Metodo para pedir la opcion del menu
	private static int pedirOpcion() throws IOException {
		int opcion = 0;
		
		System.out.print("¿Que quieres hacer?: ");
		opcion = Integer.parseInt(entrada.readLine());
		boolean valida = false;
		
		while (!valida) {
			try {
				if (opcion >= 1 && opcion <= 6) {
					valida = true;
				}else {
					System.out.println("ERROR: debes introducir un numero entre 1 y 6");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR: debes introducir un valor numerico");
			}
		}
		
		return opcion;
	}
	
	//Metodo para saber si el arraylist esta vacio
	private boolean estaVacio() {
		boolean vacio = false;
		
		if (lavadoras.isEmpty()) {
			System.out.println("No hay lavadoras en la tienda");
			System.out.println();
			vacio = true;
		}
		
		return vacio;
	}

}

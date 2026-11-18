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
					+ "[6] Mostrar total lavadoras \n"
					+ "[7] SALIR");
			
			opcion = pedirOpcion();
		} while (opcion != 7);
		
		switch (opcion) {
		case 1:
			agregarLavadora();
			break;
		case 2:
			buscarLavadora();
			break;
		case 3:
			modificarPrecioLavadora();
			break;
		case 4:
			eliminarLavadora();
			break;
		case 5:
			mostrarLavadoras();
			break;
		case 6:
			mostrarTotalLavadoras();

		default:
			System.out.println("Saliendo del programa.........");
			break;
		}

	}

	//Metodo para pedir la opcion del menu
	private static int pedirOpcion() throws IOException {
		int opcion = 0;
		
		System.out.print("¿Que quieres hacer?: ");
		opcion = Integer.parseInt(entrada.readLine());
		boolean valida = false;
		
		while (!valida) {
			try {
				if (opcion >= 1 && opcion <= 7) {
					valida = true;
				}else {
					System.out.println("ERROR: debes introducir un numero entre 1 y 7");
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
	
	//Metodo para pedir modelo
	
	
	private static void agregarLavadora() { //1
		// TODO Auto-generated method stub
		
	}

	private static void buscarLavadora() { //2
		// TODO Auto-generated method stub
		
	}

	private static void modificarPrecioLavadora() { //3
		// TODO Auto-generated method stub
		
	}

	private static void eliminarLavadora() { //4
		// TODO Auto-generated method stub
		
	}

	private static void mostrarLavadoras() { //5
		// TODO Auto-generated method stub
		
	}

	private static void mostrarTotalLavadoras() { //6
		// TODO Auto-generated method stub
		
	}
}

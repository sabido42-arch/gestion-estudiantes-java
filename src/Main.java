import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Estudiante[] estudiantesArray = new Estudiante[3];
	static ArrayList<Estudiante> estudiantesArrayList = new ArrayList<>();
	
	public static void main(String[] args) {

		int opcion;
		
		System.out.println("MENU PRINCIPAL");
		System.out.println("1. Usar Array");
		System.out.println("2. Usar ArrayList");
		System.out.println("3. Salir");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Selecciona una opción");
		opcion = teclado.nextInt();
		
		// Utilizamos switch para ver que hacer en cada opción
		
		switch(opcion) {
		
		case 1:
			menuArray();
			break;
		
		case 2:
			menuArrayList();
			break;
		
		case 3:
			System.out.println("Saliendo del programa");
			break;
			
		default:
			System.out.println("Opción no válida");
		}
	}
		
		
	// Creamos el menú Array
		
	static void menuArray() {
		
		Scanner teclado = new Scanner(System.in);
		int opcionArray = 0;	
		
		while(opcionArray != 3 ) {			
		
		System.out.println("MENU ARRAY");
		System.out.println("1. Agregar estudiante");
		System.out.println("2. Ver estudiantes");
		System.out.println("3. Salir");
		
		System.out.println("Selecciona una opción");
		opcionArray = teclado.nextInt();
		
		switch(opcionArray) {
		
		case 1:
			System.out.println("Agregar un estudiante");
			System.out.println("Introduce nombre: ");
			String nombre = teclado.next();	
			
			System.out.println("Introduce edad: ");
			int edad = teclado.nextInt();					
			
			System.out.println("Introduce nota: ");
			double nota = teclado.nextDouble();
			
			Estudiante estudiante1 = new Estudiante();
			estudiante1.nombre = nombre;
			estudiante1.edad = edad;
			estudiante1.nota = nota;
			
			boolean agregado = false;
		
			for(int i = 0; i <estudiantesArray.length; i++) {
			if (estudiantesArray[i] == null){
				estudiantesArray[i] = estudiante1;
				System.out.println("Estudiante agregado correctamente");
				agregado = true;
				break;
			}
		}
		 if (!agregado) {
			 System.out.println("Array lleno");
		}
		break;
			
		case 2:
			System.out.println("Ver estudiantes en el Array");
			for(int i = 0; i <estudiantesArray.length; i++) {
			
				if(estudiantesArray[i] != null) {
					
					System.out.println("Nombre: " + estudiantesArray[i].nombre);
					System.out.println("Edad: " + estudiantesArray[i].edad);
					System.out.println("Nota: " + estudiantesArray[i].nota);
					System.out.println("---------------------");
				}		
			}
			
			break;
			
			
		case 3:
			System.out.println("Volver al menú principal");
			break;
			
		default:
			System.out.println("opción no válida"); 	
		}		
	}
	}

static void menuArrayList() {

Scanner teclado = new Scanner(System.in);
int opcionArrayList = 0;

while (opcionArrayList != 5) {
			

	System.out.println("MENU ARRAYLIST");
	System.out.println("1. Agregar estudiante al ArrayList");
	System.out.println("2. Ver estudiantes en el ArrayList");
	System.out.println("3. Eliminar un estudiante del ArrayList");
	System.out.println("4. Buscar un estudiante por nombre en el ArrayList");
	System.out.println("5. Volver al menú principal");

	System.out.println("Selecciona una opción");
	opcionArrayList = teclado.nextInt();

	switch (opcionArrayList) {

		case 1:
			System.out.println("Introduce nombre: ");
			String nombre = teclado.next();
			
			System.out.println("Intoroduce edad: ");
			int edad = teclado.nextInt();
			
			System.out.println("Introduce nota: ");
			double nota = teclado.nextDouble() ;
			
			Estudiante estudiante1 = new Estudiante();
			estudiante1.nombre = nombre;
			estudiante1.edad = edad;
			estudiante1.nota = nota;
			
			estudiantesArrayList.add(estudiante1);
			System.out.println("Estudiante agregado correctamente al ArrayList");
			break;


		case 2: 
			System.out.println("Ver estudiantes en el ArrayList");
			for(int i = 0; i < estudiantesArrayList.size(); i ++) {
					
					System.out.println("nombre: " +  estudiantesArrayList.get(i).nombre);
					System.out.println("edad: " + estudiantesArrayList.get(i).edad);
					System.out.println("nota: " + estudiantesArrayList.get(i).nota);
					System.out.println("-----------------------");
			}	
			break;
			
			
		case 3:
			System.out.println("Eliminar un estudiante del ArrayList");
			System.out.println("Introduce nombre a eliminar: ");
			String nombreEliminar = teclado.next();
			
			boolean eliminado = false;
			
			for(int i =0; i < estudiantesArrayList.size(); i ++) {
				if(estudiantesArrayList.get(i).nombre.equals(nombreEliminar)) {
					estudiantesArrayList.remove(i);
					System.out.println("Estudiante eliminado correctamente");
					eliminado = true;	
			break;
			}
	}
			
		if(!eliminado) {
			System.out.println("Estudiante no encontrado");
		}
		break;
		
		
		case 4:
			System.out.println("Buscar un estudiante por nombre en el ArrayList");
			System.out.println("Introduce nombre a buscar: ");
			String nombreBuscar = teclado.next();
			
			 boolean encontrado = false;
			 
			for(int i = 0; i < estudiantesArrayList.size(); i ++) {
				if(estudiantesArrayList.get(i).nombre.equals(nombreBuscar)) {
					
					System.out.println("Nombre: " + estudiantesArrayList.get(i).nombre);
					System.out.println("Edad: " + estudiantesArrayList.get(i).edad);
					System.out.println("Nota: " + estudiantesArrayList.get(i).nota);
					
			encontrado = true;
			break;
				}
			}
			if(!encontrado) {
				System.out.println("Estudiante no encontrado");
			}
			
			break;
			
			
		case 5:
			System.out.println("Volver al menu principal");
			break;
			
		default:
			System.out.println("Opción no válida");
			}
		}
	}
}

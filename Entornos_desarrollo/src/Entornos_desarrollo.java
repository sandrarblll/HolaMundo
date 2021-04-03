/*Crea un array con los nombres de 5 alumnos, posteriormente un array con las 
 notas de dichos alumnos. El programa solicitará el nombre del alumno, y 
 devolverá su nota.*/

//importamos librería java util
import java.util.Scanner;

public class Entornos_desarrollo {

	public static void main(String[] args){
		//Activamos Scanner para poder leer de teclado
		Scanner leer=new Scanner(System.in);
				
		//Declaramos la variable
		String nombre;
				
		//Declaramos los arrays y les damos valor
		String[]alumnos={"Ana", "Maria", "Paco", "Jose", "Juan"};
		double[]notas={2, 5, 7, 8, 3};
		boolean existe=false;
				
		//Hacemos un menu mostrando los nombres de los alumnos
				
		System.out.println("Los alumnos que están en nuestro centro son: \nAna. \nMaria. \nPaco. \nJose. \nJuan.");
				
		System.out.println("Indique el nombre del alumno del que quiera saber la nota: ");
		nombre=leer.nextLine();
				
		//Hacemos bucle para que recorra los arrays con los nombres y las notas
		for(int i=0; i<alumnos.length; i++){
			if(alumnos[i].equalsIgnoreCase(nombre)){
				System.out.println("El alumno "+alumnos[i]+" ha sacado un "+notas[i]); 
				existe=true;
				break;
			}
		}
		if(!existe){
			System.out.println("El alumno indicado no se encuentra en el listado");
		}
	}

}



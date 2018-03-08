/* Tenemos un Instituto de Enseñanza Secundaria donde conviven Alumnos y Profesores.
 * Implementar una clase Persona, que debe contener los siguientes atributos:
 *  · nombre: Nombre de la persona.
 *  · anyoNacimiento: Año de nacimiento de la persona.
 * 
 * A parte se deben implementar la clase Profesor que hereda de la clase Persona y
 * contiene los siguientes atributos:
 *  · salario: Salario que cobra el profesor.
 *  
 * También se debe implementar la clase Alumno que hereda de la clase Persona y
 * contiene los siguientes atributos:
 *  · curso: Curso actual que está cursando (puede definirse como un string).
 *  
 * Implementar los constructores, métodos getters y setters y los métodos toString()
 * para cada una de las clases.
 * 
 * Crear una clase principal que cree objetos tanto de la clase Profesor como de la
 * clase Alumno.
 * 
 * A los alumnos del centro se les aplica un descuento en secretaría del 10% a la hora
 * comprar artículos, mientras que a los profesores se les aplica un descuento del 2%.
 * Crear un método llamado calculaDescuento() que se le pase una cantidad como parámetro
 * y devuelva el porcentaje correcto en caso de si es un profesor o un alumno. Utilizar
 * Herencia en Programación Orientado a Objetos para implementar esta funcionalidad.
 * 
 * Opcional: Implementar el método calculaDescuento() utilizando polimorfismo y definiéndolo
 * de manera abstracta en la clase Persona, para obligar a todas las clases que heredan
 * de la clase Persona a definirlo.
 * 
 */

package Instituto;
 
import java.lang.*;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona alu1=new Alumno("Daniel", 1988, "Java");
		System.out.println(alu1.toString()+"\n"+ "Le corresponde de descuento "+ alu1.calculaDescuento(29.95));
		
		Persona alu2=new Alumno("Juan", 1992, "Desarrollo de interfaces");
		System.out.println(alu2.toString());
		
		Persona pro1=new Profesor("Jonay", 1981, 30000);
		System.out.println(pro1.toString()+ "\n"+"Le corresponde de descuento " + pro1.calculaDescuento(100));
		
		Persona pro2=new Profesor("Álvaro", 1979, 30000);
		System.out.println(pro2.toString());
		
		
		
	}

}

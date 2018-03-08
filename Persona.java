package Instituto;

public abstract class Persona {
	//Atributos
	private String nombre;
	
	private int anyo;
	//Constructor
	public Persona(String nombre, int a�o) {
		
		this.nombre=nombre;
		
		this.anyo=a�o;
		
	}
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public int dameAnyo() {
		
		return anyo;
	}
	
	public void estableceNombre(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public void estableceAnyo(int anyo) {
		
		this.anyo=anyo;
		
	}
	public String toString() {
		
		return "se llama " + nombre + " y naci� en el a�o " + anyo;
		
	}
	
	public abstract double calculaDescuento(double c);

	

}

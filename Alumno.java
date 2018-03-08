package Instituto;

public class Alumno extends Persona {
	//atributo
	private String curso;
	//constructor
	public Alumno(String nombre, int año, String curso) {
		
		super(nombre, año);
		this.curso=curso;
		
	}
	
	//método setter
	public void estableceCurso(String c) {
		
		curso=c;
	}
	
	public String dameCurso() {
		
		return curso;
	}
	
	public String toString() {
		
		String mensaje="El alumno " + super.toString() + ", y está cursando " + curso;
		
		return mensaje;
	}

	@Override
	public double calculaDescuento(double c) {
		// TODO Auto-generated method stub
		double descuento=c*0.1;
		return descuento;
		
	}

}

package Instituto;

public class Profesor extends Persona{
	//atributo
	private int salario;
	//constructor
	public Profesor(String nombre, int a�o, int salario) {
		
		super(nombre, a�o);
		this.salario=salario;
		
	}
	//m�todo setter
	public void establecerSalario(int s) {
		
		salario=s;
		
	}
	
	public int dameSalario() {
		
		return salario;
	}
	@Override
	public String toString() {
		
		String mensaje="El profesor " + super.toString() + ", su salario es de " + salario + " euros";
		
		return mensaje;
		
	}

	
	public double calculaDescuento(double c) {
		// TODO Auto-generated method stub
		double descuento=c*0.02;
		return descuento;
		
	}
	
}

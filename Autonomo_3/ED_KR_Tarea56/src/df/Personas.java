package df;

public class Personas {
	private String cedula;
	private String nombre;
	private int edad;
	private double peso;

	public Personas(String cedula, String nombre, int edad, double peso) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "\n Cedula: " + cedula + ", " + nombre + ", " + edad + " años, " + peso + " kg \n";
	}

}

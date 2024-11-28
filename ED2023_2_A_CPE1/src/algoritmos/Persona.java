package algoritmos;

public class Persona implements Comparable <Persona> {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	//comparar
	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		if (this.edad < p.getEdad())
			return -1;
		else
			if (this.edad < p.getEdad())
				return 1;
			else
				return this.nombre.compareTo(p.getNombre());
	}
	
	
	
}

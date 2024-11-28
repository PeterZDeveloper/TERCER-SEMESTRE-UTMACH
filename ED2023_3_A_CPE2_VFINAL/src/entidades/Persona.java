package entidades;

public class Persona implements Comparable <Persona> {

	private String cedula;
	private double peso;

	public Persona(String cedula, double peso) {
		super();
		this.cedula = cedula;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", peso=" + peso + "]";
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Persona p) {
		// Comparamos primero por peso
		int comparacionPorPeso = Double.compare(this.peso, p.getPeso());
		//retorna 0 si es igual el peso
		// Si tienen el mismo peso, comparamos por cédula
		if (comparacionPorPeso == 0) {
			return this.cedula.compareTo(p.getCedula());
		} else {
			return comparacionPorPeso;
		}
	}

}

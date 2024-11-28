package df;

import java.io.Serializable;

public class Libro implements Serializable {

	private static final long serialVersionUID = 1L;
	private String titulo;
	private int year;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Libro(String titulo, int year) {
		super();
		this.titulo = titulo;
		this.year = year;
	}
	@Override
	public String toString() {
		return "[titulo=" + titulo + ", year=" + year + "]";
	}
	
	

}

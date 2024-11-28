package archivos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Fausto Redrov�n
 * @version 15/06/2023
 *
 * @param <T> Tipo de dato gen�rico para el tipo de objeto a guardar en el archivo
 */
public class Escritura<T> {
	private String nombreArchivo;
	private FileOutputStream archivo;
	private ObjectOutputStream escritura;

	/**
	 * Constructor que inicializa el nombre del archivo para escritura
	 * @param nombreArchivo Ruta y nombre del archivo que contendr� los objetos a guardar
	 */
	public Escritura(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}
	
	/**
	 * Abre el flujo para guardar los objetos hacia el archivo <em>nombreArchivo</em>
	 * @throws IOException Lanza la excepci�n de I/O ante cualquier error con el archivo
	 */
	public void abrir() throws IOException {
		archivo = new FileOutputStream(nombreArchivo);
		escritura = new ObjectOutputStream(archivo);
	}

	/**
	 * @param dato Objeto tipo <T> que ser� guardado en el archivo configurado
	 * @throws IOException
	 */
	public void escribir(T dato) throws IOException {
		if(escritura != null)
			escritura.writeObject(dato);
	}
	
	/**
	 * Cierra el flujo para desbloquear el archivo
	 * @throws IOException
	 */
	public void cerrar() throws IOException {
		if(escritura !=null)
			escritura.close();
	}
	
	
}

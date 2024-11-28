package literal1;

public class Vector<T> { 
	private T[] vector;
	private String nombre;
	private int longitud;
	
	@SuppressWarnings("unchecked")
	public Vector(int longitud, String nombre) {
		this.vector = (T[]) new Object[longitud];
		this.longitud = longitud;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getLongitud() {
		return longitud;
	}

	public boolean ingresarElemento(T dato) {
		return ingresarElemento(0, dato);
	}
	
	public boolean ingresarElemento(int pos, T dato) {
		boolean resul = false;
		
		while(pos>=0 && pos<=vector.length-1 && !resul) {
			if(leerElemento(pos) == null) {
				vector[pos] = dato;
				resul = true;
			}
			else
				pos++;
		}		
		return resul;
	}

	public void imprimirVector() {
		for(T elem : vector)
			if(elem !=null)
				System.out.println(elem);
	}

	public void imprimirVectorCompleto() {
		for(int pos=0; pos<vector.length; ++pos) {
			System.out.println(pos + ": " + leerElemento(pos));
		}
	}
	
	public T leerElemento(int pos) {
		if(pos>=0 && pos<vector.length)
			return vector[pos];
		else
			return null;
	}
	
	public boolean modificarElemento(int pos, T dato) {
		boolean resul = false;
		
		if(pos>=0 && pos<vector.length && leerElemento(pos)!= null) {
			vector[pos] = dato;
			resul = true;
		}		
		return resul;
	}
	
	public boolean eliminarElemento(int pos) {
		return modificarElemento(pos, null);
	}
	
	//Metodo no estructurado por exceso de return
    public int buscarElemento(T dato) {
    	//ahora si al añadirle el else y el resul esta estructurado.
    	int resul = 0;
    	
        for (int pos = 0; pos < vector.length; ++pos) {
            if (dato != null && dato.equals(leerElemento(pos) ) ) {
            	resul =  pos; //Se le asigna al valor de la posicion encontrada
                //dato != null &&
            	//este codigo sirve para evitar el error java.lang.nullpointerexception
            }
            else {
            	resul = -1; //Se le asigna este valor en caso de que no encuentre
            }
        }
        return resul; //Se le asigna al valor de la posicion encontrada
    }
}

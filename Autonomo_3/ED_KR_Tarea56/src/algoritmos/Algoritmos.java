package algoritmos;

public class Algoritmos {

	public static int fibonacci(int n) {
		if(n==1 || n==2) {
			return n-1;
		}else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }		
	}
	
	public static long fibonacciOptimo(int n) {
		long[] vector;
		if(n==1 || n==2) {
			return n-1;
		}else {
			 vector = new long[n+1];
			 for(int i=0; i<vector.length; i++) {
				 vector[i]=-1;
			 }
			 vector[1]=0;
			 vector[2]=1;
			 return fibonacciOptimoR(n, vector);
        }		
	}
	
	private static long fibonacciOptimoR(int n, long[] vector) {
		if(n>2) {
			if(vector[n-1] == -1) {
				vector[n-1] = fibonacciOptimoR(n-1, vector);
			}else if(vector[n-2] == -1) {
				vector[n-2] = fibonacciOptimoR(n-2, vector);
			}
		}return vector[n-1] + vector [n-2];
	}
	

	public static long factorial(int n) {
		long resul;
		if (n == 0 || n == 1)
			resul = 1;
		else
			resul = n * factorial(n - 1);
		return resul;
	}

	public static long potencia(int b, int n) {
		if (n == 0)
			return 1;
		else
			return b * potencia(b, n - 1);
	}

	/**
	 * M�todo recursivo para sumar enteros desde 1 hasta n
	 * 
	 * @param n L�mite de la suma
	 * @return Resultado de sumar los enteros desde el 1 hasta n
	 */
	public static int suma(int n) {
		if (n == 1)
			return 1;
		else
			return n + suma(n - 1);
	}

	/**
	 * M�todo 2 para sumar enteros desde 1 hasta n utilizando un m�todo recursivo de
	 * cola
	 * 
	 * @param n L�mite de la suma
	 * @return Resultado de sumar los enteros desde el 1 hasta n
	 */
	public static int suma2(int n) {
		return suma2(n, 0);
	}

	/**
	 * M�todo recursivo 2 para sumar enteros desde 1 hasta n
	 * 
	 * @param n L�mite de la suma
	 * @return Resultado de sumar los enteros desde el 1 hasta n
	 */
	private static int suma2(int n, int sum) {
		sum += n;
		if (n > 1)
			sum = suma2(n - 1, sum);
		return sum;
	}

	/**
	 * Determina si num es un n�mero primo o no
	 * 
	 * @param num N�mero para determinar si es primo o no
	 * @return True si num es primo, False si no lo es
	 */
	public static boolean esPrimo(int num) {
		return esPrimo(num, 2);
	}

	/**
	 * M�todo recursivo para determinar si num es n�mero primo
	 * 
	 * @param num N�mero entero a saber si es primo
	 * @param div Divisor de prueba
	 * @return True si num es primo, False si no lo es
	 */
	private static boolean esPrimo(int num, int div) {
		if (num / 2 < div)
			return true;
		else if (num % div == 0)
			return false;
		else
			return esPrimo(num, div + 1);
	}

	/**
	 * Muestra en pantalla los n primeros n�meros primos
	 * 
	 * @param n Cantidad de n�meros primos requeridos
	 */
	public static void nPrimos(int n) {
		nPrimos(n, 2);
	}

	/**
	 * M�todo recursivo que muestra en pantalla los n primeros n�meros primos
	 * 
	 * @param n   Cantidad de n�meros primos requeridos
	 * @param num N�mero a verificar si es primo o no
	 */
	private static void nPrimos(int n, int num) {
		if (n >= 1)
			if (esPrimo(num)) {
				System.out.println(num);
				nPrimos(n - 1, num + 1);
			} else
				nPrimos(n, num + 1);
	}

	/**
	 * Inicializa el m�todo recursivo que imprime en pantalla el contenido de un
	 * arreglo unidimensional
	 * 
	 * @param <T>    Clase gen�rica que indica el tipo de objeto del vector
	 * @param vector Vector cuyos elementos se desean imprimir en pantalla
	 */
	public static <T> void imprimirVector(T[] vector) {
		imprimirVector(vector, 0);
	}

	/**
	 * M�todo recursivo para imprimir en pantalla el contenido de un arreglo
	 * unidimensional
	 * 
	 * @param <T>    Clase gen�rica que indica el tipo de objeto del vector
	 * @param vector Vector cuyos elementos se desean imprimir en pantalla
	 * @param pos    Posici�n inicial
	 */
	private static <T> void imprimirVector(T[] vector, int pos) {
		if (pos >= 0 && pos < vector.length) {
			System.out.println(vector[pos]);
			imprimirVector(vector, pos + 1);
		}
	}

	/**
	 * Genera un n�mero entero aleatorio en un rango, entre <em>m</em> y <em>n</em>
	 * (<em>m</em> &lt; <em>n</em>).
	 * 
	 * @param m Valor inicial del rango
	 * @param n Valor final del rango
	 * @return N�mero entero aleatorio en el rango dado
	 */
	public static int aleatorio(int m, int n) {
		return (int) redondearDecimales(Math.random() * (n - m) + m, 0);
	}

	/**
	 * Genera un n�mero real aleatorio en un rango, entre <em>m</em> y <em>n</em>
	 * (<em>m</em> &lt; <em>n</em>) con un n�mero de decimales dado.
	 * 
	 * @param m               Valor inicial del rango
	 * @param n               Valor final del rango
	 * @param numeroDecimales N�mero de decimales que se requieren en el n�mero
	 *                        generado
	 * @return N�mero real aleatorio en el rango y con n�mero de decimales dados
	 */
	public static double aleatorio(int m, int n, int numeroDecimales) {
		return redondearDecimales(Math.random() * (n - m) + m, numeroDecimales);
	}

	/**
	 * Redondea un n�mero real <em>valor</em> al n�mero de decimales
	 * <em>numeroDecimales</em> dado.
	 * 
	 * @param valor           N�mero real a redondear
	 * @param numeroDecimales N�mero de decimales que se requieren
	 * @return N�mero real redondeado al n�mero de decimales dado
	 */
	public static double redondearDecimales(double valor, int numeroDecimales) {
		double parteEntera, resultado;
		resultado = valor;
		parteEntera = Math.floor(resultado);
		resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
		resultado = Math.round(resultado);
		resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
		return resultado;
	}

	/**
	 * Genera el d�gito verificador que valida una c�dula. Solo se requieren los
	 * primeros 9 d�gitos de la c�dula.
	 * 
	 * @param cedula9 Los primeros 9 d�gitos de una c�dula
	 * @return D�gito verificador que es el d�cimo d�gito de la c�dula
	 */
	public static int generarVerificadorDeCedula(String cedula9) {
		int verificador, tercerDigito;
		int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
		int suma, digito;

		try {

			if (cedula9.length() == 9) // Solo 9 d�gitos el d�cimo es el verificador
			{
				tercerDigito = Integer.parseInt(cedula9.substring(2, 3));
				if (tercerDigito < 6) {
					// Coeficientes de validaci�n c�dula
					// El d�cimo d�gito se lo considera d�gito verificador
					suma = 0;
					digito = 0;
					for (int i = 0; i < cedula9.length(); i++) {
						digito = Integer.parseInt(cedula9.substring(i, i + 1)) * coefValCedula[i];
						suma += ((digito % 10) + (digito / 10));
					}
					if (suma % 10 == 0) {
						verificador = suma % 10;
					} else {
						verificador = 10 - (suma % 10);
					}
				} else {
					verificador = -1;
				}
			} else {
				verificador = -1;
			}
		} catch (NumberFormatException nfe) {
			verificador = -1;
		} catch (Exception err) {
			System.out.println("Una excepcion ocurrio en el proceso de generaci�n");
			verificador = -1;
		}
		return verificador;
	}

	/**
	 * Genera un n�mero de c�dula por provincia (c�digo de 2 caracteres)
	 * 
	 * @param provincia C�digo de provincia. Para El Oro es 07
	 * @return Un n�mero de c�dula aleatorio de la provincia
	 */
	public static String cedulaAleatorio(String provincia) {
		StringBuffer cedula9 = new StringBuffer();
		int decimoDigito;

		do {
			cedula9.delete(0, cedula9.length()); // vac�a el StringBuffer
			for (int i = 3; i <= 9; ++i) { // genera 9 d�gitos
				cedula9.append((int) aleatorio(0, 9, 0)); // del 0 al 9
			}
			cedula9.insert(0, provincia);
			decimoDigito = generarVerificadorDeCedula(cedula9.toString());
		} while (decimoDigito < 0);
		return cedula9.toString() + decimoDigito;
	}

	/**
	 * Genera un n�mero de c�dula aleatorio de acuerdo a las 24 provincias. Utiliza
	 * una clase Enum Provincia con el c�digo de cada una.
	 * 
	 * @return Un n�mero de c�dula aleatorio de una de las 24 provincias
	 */
	public static String cedulaAleatorio() {
		int provincia;

		provincia = aleatorio(1, Provincia.values().length);
		if (provincia < 10)
			return cedulaAleatorio("0" + String.valueOf(provincia));
		else
			return cedulaAleatorio(String.valueOf(provincia));
	}

	/**
	 * M�todo para verificar si una c�dula es v�lida.
	 * 
	 * @param cedula C�dula a verificar su validez.
	 * @return true si la c�dula es v�lida y false si la c�dula no es v�lida.
	 */
	public static boolean verificaCedula(String cedula) {
		int digitoVerificador = generarVerificadorDeCedula(cedula.substring(0, cedula.length() - 1));
		int decimoDigito = Character.getNumericValue(cedula.charAt(9));
		return digitoVerificador == decimoDigito;
	}

	/**
	 * Genera de manera aleatoria una letra may�scula entre A y Z
	 * 
	 * @return Letra may�scula aleatoria
	 */
	public static char letraMayAleatoria() {
		return (char) aleatorio(65, 90);
	}

	/**
	 * Genera de manera aleatoria una letra min�scula entre a y z
	 * 
	 * @return Letra min�scula aleatoria
	 */
	public static char letraMinAleatoria() {
		return (char) aleatorio(97, 122);
	}

	/**
	 * Genera un n�mero de placa de veh�culo aleatoria
	 * 
	 * @return N�mero de placa de la forma AAA-0000
	 */
	public static String generarPlacaAleatoria() {
		StringBuffer placa = new StringBuffer();
		for (int i = 1; i <= 3; ++i)
			placa.append(Provincia.values()[aleatorio(0, 23)].getCodigo());
		placa.append('-');
		for (int i = 1; i <= 4; ++i)
			placa.append(aleatorio(0, 9));
		return placa.toString();
	}

	/**
	 * Genera un n�mero de placa de veh�culo aleatoria, de acuerdo al c�digo de
	 * provincia dado. El Oro es 7 por ejemplo.
	 * 
	 * @param provincia C�digo de la provincia
	 * @return N�mero de placa de la forma AAA-0000 o null si el c�digo dado no es
	 *         v�lido.
	 */
	public static String generarPlacaAleatoria(int provincia) {
		if (provincia >= 1 && provincia <= 24) {
			StringBuffer placa = new StringBuffer();
			placa.append(Provincia.values()[provincia - 1].getCodigo());
			for (int i = 1; i <= 2; ++i)
				placa.append(Provincia.values()[aleatorio(0, 23)].getCodigo());
			placa.append('-');
			for (int i = 1; i <= 4; ++i)
				placa.append(aleatorio(0, 9));
			return placa.toString();
		} else
			return null;
	}
}

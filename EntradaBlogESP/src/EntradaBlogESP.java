
/**
 * Clase para manejar las entradas de un blog.
 * 
 * @author Edgar Sanchez Pineda
 * @version 2.3
 * @since 14/03/2021
 */

public class EntradaBlogESP {

	/**
	 * separador es el carácter que separa ENTRADA DE del nombre del autor
	 */
	public static char separador = ':';
	private int id;
	private String texto;
	private String autor;

	/**
	 * Constructor de la clase.
	 * 
	 * @param id - es el numero de entrada
	 * @param autor - es el nombre del autor
	 * @param texto - es el contenido de la entrada
	 * @throws IllegalArgumentException - excepción si el número de entrada es
	 *                                   negativo.
	 */
	public EntradaBlogESP(int id, String autor, String texto) throws IllegalArgumentException {
		if (id <= 0)
			throw new IllegalArgumentException("El id no puede ser negativo");
		this.id = id;
		this.autor = autor;
		this.texto = texto;
	}

	@Override
	public String toString() {
		String cad = "";
		cad += "\nENTRADA DE" + separador + autor;
		cad += "\n " + texto;
		return cad;
	}

	/**
	 * @return id - número de la entrada
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @return texto - contenido de la entrada
	 */
	public String getTexto() {
		return this.texto;
	}

	/**
	 * @return autor - nombre del autor en mayúscula
	 */
	public String getAutor() {
		return this.autor.toUpperCase();
	}

	/**
	 * @return autor - nombre del autor
	 * @deprecated
	 * @see getAutor()
	 */
	public String devuelveAutor() {
		return this.autor;
	}

	/**
	 * Método main. 
	 * 
	 * @param args - No tiene por qué tener argumentos.
	 */
	public static void main(String[] args) {

		EntradaBlogESP e1 = new EntradaBlogESP(3, " EDGAR SÁNCHEZ PINEDA",
				"Últimas noticias: está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
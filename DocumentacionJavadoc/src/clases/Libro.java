package clases;

/**
 * This class allow us to give value to different variables related to books and extract said values if requested
 *    
 * @author jperez
 * @version 1.0
 *
 */

public class Libro {
	/**
	 * Title of the book
	 */
	private String titulo;
	/**
	 * Name of the author
	 */
	private String autor;
	/**
	 * Amount of books
	 */
	private int ejemplares;
	/**
	 * Books that have been borrowed
	 */
	private int prestados;
	
	//constructor por defecto
	
	/**
	 * default constructor
	 */
	public Libro() {} 
	
	// constructor con parametros
	
	/**
	 * This method its a constructor with parameters, its used to give values to the attributes equal to the values of the entry parameters in the constructor
	 * 
	 * @param titulo variable that stores the value that will be given to the attribute titulo
	 * @param autor variable that stores the value that will be given to the attribute autor
	 * @param ejemplares variable that stores the value that will be given to the attribute ejemplares
	 * @param prestados variable that stores the value that will be given to the attribute prestados
	 */
	public Libro (String titulo,String autor,int ejemplares,int prestados) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		
	}
	// constructor copia
	
	/**
	 * This constructor its used to make the current values of the attributes within the class Libro final making a copy of the previously introduced values
	 * 
	 * @param lib its used to make an attribute become a final attribute
	 */
	public Libro( final Libro lib) {
		titulo=lib.titulo;
		autor=lib.autor;
		ejemplares=lib.ejemplares;
		prestados=lib.prestados;
	}
	
	//getters y setters
	
	/**
	 * Method used to give a new value to the attribute titulo
	 * 
	 * @param titulo variable used to give a new value to the attribute titule
	 */
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	/**
	 * Method used to get the current value of the attribute titulo
	 * 
	 * @return The current value of the attribute titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Method used to give a new value to the attribute autor
	 * 
	 * @param autor variable used to give a new value to the attribute autor
	 */
	public void setAutor( String autor) {
		this.autor=autor;
	}
	
	/**
	 * Method used to get the current value of the attribute autor
	 * 
	 * @return The current value of the attribute autor
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Method used to give a new value to the attribute ejemplares
	 * 
	 * @param ejemplares variable used to give a new value to the attribute ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares=ejemplares;
	}
	
	/**
	 * Method used to get the current value of the attribute ejemplares
	 * 
	 * @return The current value of the attribute ejemplares
	 */
	public int getEjemplares() {
		return ejemplares;
	}
	
	/**
	 * Method used to give a new value to the attribute prestados
	 * 
	 * @param prestados variable used to give a new value to the attribute prestados
	 */
	public void setPrestados(int prestados) {
		this.prestados=prestados;
	}
	
	/**
	 * Method used to get the current value of the attribute prestados
	 * 
	 * @return The current value of the attribute prestados
	 */
	public int getPrestados() {
		return prestados;
	}
	
	//metodo toString
	
	/**
	 * Method used to create a String containing the values of the attributes 
	 * 
	 * @return The current value of the variable String mensaje
	 */
	public String toString() {
		String mensaje="T�tulo: "+titulo+"\nAutor: "+autor+"\nEjemplares: "+ejemplares+"\nPrestados: "+prestados+"\n----------------\n";
		return mensaje;
	}
	
	// M�todo pr�stamo que incremente el atributo correspondiente cada vez que se realice un pr�stamo del libro. 
	//No se podr�n prestar libros de los que no queden ejemplares disponibles para prestar. 
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
	
	/**
	 * Method used to increase the value of the corresponding attribute each time that a book its borrowed.
	 * It wont be possible to borrow books of wich there is no copies available for borrowing.
	 * Returns true if its possible to realize the operation and false otherwise.
	 * 
	 * @return The current value of the variable boolean prestamo
	 */
	public boolean prestamoLibro() {
		boolean prestamo=true;
		if (prestados<ejemplares)
		{
			prestados++;
			
		}
		else
		{
			prestamo=false;
		}
		return prestamo;
	}
		
	//M�todo devoluci�n que decremente el atributo correspondiente cuando se produzca la devoluci�n de un libro
	//No se podr�n devolver libros que no se hayan prestado.
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
		
	/**
	 * Method used to decrease the value of the corresponding attribute when a book its returned.
	 * It wont be possible to return books that have not been borrowed.
	 * Returns true if its possible to realize the operation and false otherwise.
	 * 
	 * @return The current value of the variable boolean devuelto
	 */
	public boolean devolucionLibro() {
			boolean devuelto=true;
			if(prestados>0) {
				prestados--;
			}
			else
			{
				devuelto=false;
			}
			return devuelto;		
		}
	
}

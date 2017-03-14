package tablas;

public class ALUMNO {
	String numMatricula;
	String nombre;
	String apellido;
	int edad;

	public ALUMNO(String numMatricula, String nombre, String apellido, int edad) {
		super();
		this.numMatricula = numMatricula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public ALUMNO() {
		super();
	}

	public String getnumMatricula() {
		return numMatricula;
	}

	public void setnumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}

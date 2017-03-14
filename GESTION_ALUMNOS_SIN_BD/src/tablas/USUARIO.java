package tablas;

public class USUARIO {
	public String nombre;
	public String contrasenia;

	public USUARIO(String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}

	public USUARIO() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getcontrasenia() {
		return contrasenia;
	}

	public void setcontrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}

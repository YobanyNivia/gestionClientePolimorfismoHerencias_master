package clases;

public class Personas extends Clientes {
	
	private String cedula;
    private String celular;

    public Personas() {
    }

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Personas ["
		+ "Cedula="        + cedula         + "\n"
		+ "Celular="       + celular 		+ "\n"
		+ "Nombre="        + getNombre()    + "\n"
		+ "Telefono="      + getTelefono()  + "\n"
		+ "Direccion="     + getDireccion() + "\n"
		+ "Producto="      + getProducto()  +"]";
		
	}

    
}

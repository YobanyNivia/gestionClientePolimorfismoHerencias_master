package clases;

import java.awt.List;

public class Clientes {
	private String nombre;
    private String telefono;
    private String direccion;
    private List producto;

    public Clientes() {
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List getProducto() {
		return producto;
	}


	public void setProducto(List string) {
		this.producto = string;
	}


	@Override
	public String toString() {
		return "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", producto="
				+ producto;
	}

    

}

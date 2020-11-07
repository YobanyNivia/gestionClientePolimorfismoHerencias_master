package clases;

import java.awt.List;

public class Empresas extends Clientes {
	
	private String tipDoc;
    private String documento;
    private String representante;


    public Empresas() {
    	
    }
	
	public Empresas(String tipDoc, String documento, String representante) {
		super();
		this.tipDoc = tipDoc;
		this.documento = documento;
		this.representante = representante;
	}

	public String getTipDoc() {
		return tipDoc;
	}

	public void setTipDoc(String tipDoc) {
		this.tipDoc = tipDoc;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getRepresentante() {
		return representante;
	}


	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	@Override
	public String toString() {
		return "Empresas ["
				+ "TipDoc="        + tipDoc         + "\n" 
				+ "Documento="     + documento      + "\n"
				+ "Representante=" + representante  + "\n"
				+ "Nombre="        + getNombre()    + "\n"
				+ "Telefono="      + getTelefono()  + "\n"
				+ "Direccion="     + getDireccion() + "\n"
				+ "Producto="      + getProducto()  + "]";
	
	}

	
}

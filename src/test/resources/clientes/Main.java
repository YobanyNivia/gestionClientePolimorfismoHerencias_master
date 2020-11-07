package clientes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import clases.Producto;
import clases.Clientes;
import clases.Empresas;
import clases.Personas;


public class Main {

	static ArrayList<Producto>vectorProducto = new ArrayList <Producto>();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean salir = false;		
	    while (!salir) {
	    	
	    	try {
	    	int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción:\n"
	    			  +	" * 1 Empresas\n"
			          + " * 2 Personas\n"
			          + " * 3 Productos\n"
			          + " * 4 Salir. ")); 
	    	switch(opcion) {
	    	case 1:
	    		menu(opcion);	    		
	    		break;
	    	case 2:
	    		menu(opcion);
	    		break;
	    	case 3:
	    		productos();
	    		break;
	    	case 4:
	    		salir = true;
	    		break;
	    	default:
	    		JOptionPane.showInternalMessageDialog(null,"La opción registrada no es valida",
	    				"Información",
	    				JOptionPane.WARNING_MESSAGE);
	    		
	    	}
	    	
	    	}
	    	catch (InputMismatchException|NumberFormatException e){
	    		JOptionPane.showMessageDialog(null, "El valor ingresado no es numerico",
	    				"Error",
	    				JOptionPane.ERROR_MESSAGE);
	    	}
	    	
	    }

	}
	
	private static void menu(int opcion) {

		ArrayList<Clientes>vectorClientes = new ArrayList <Clientes>();
		String nombre3;
		boolean salir2 = false;
		String descripcion = "Empresas";		

		
		if (opcion == 2){
			
			descripcion = "Personas";
		}

	    while (!salir2) {
	    	
	    	try {
	    	int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción:\n"
	    			    + " * 1 Agregar " + descripcion + "\n"
					    + " * 2 Editar " + descripcion + "\n"
					    + " * 3 Eliminar " + descripcion + "\n"
					    + " * 4 Consultar " + descripcion + "\n"
					    + " * 5 Salir de la aplicacion"));
	    			  
	    	switch(opcion2) {
	    	case 1:
	    		if (opcion == 1) {
	    			
	    		Empresas empresas = new Empresas ();
	    		empresas.setNombre(JOptionPane.showInputDialog("Nombre del cliente"));
            	empresas.setTelefono(JOptionPane.showInputDialog("Telefono del cliente"));
            	empresas.setDireccion(JOptionPane.showInputDialog("Direccion del cliente"));
            	empresas.setTipDoc(JOptionPane.showInputDialog("Tipo de documento"));
            	empresas.setDocumento(JOptionPane.showInputDialog("Documento"));
            	empresas.setRepresentante(JOptionPane.showInputDialog("Representante"));
           // 	empresas.setProducto(JOptionPane.showInputDialog("Productos"));
            	
            	
            	//nombre3 = JOptionPane.showInputDialog("Productos");
            	//for (int x=0; x<vectorProducto.size();x++) {
            		
            		//if (vectorProducto.get(x).getNombre().equals(nombre3)) {
       
            			// empresas.setProducto(nombre3);
            	      //   }
            		
            	       //}
            	
            	vectorClientes.add(empresas);
            	
	    		}else {
	    			
	    			Personas personas = new Personas ();
	            	personas.setNombre(JOptionPane.showInputDialog("Nombre del cliente"));
	            	personas.setTelefono(JOptionPane.showInputDialog("Telefono del cliente"));
	            	personas.setDireccion(JOptionPane.showInputDialog("Direccion del cliente"));
	            	personas.setCedula(JOptionPane.showInputDialog("Cedula"));
	            	personas.setCelular (JOptionPane.showInputDialog("Celular"));
	          //   	clientes.setProducto(JOptionPane.showInputDialog("Productos Cliente"));
	            	vectorClientes.add(personas);
	    		}
	    		
	    		break;
	    	case 2:
	    		nombre3 = JOptionPane.showInputDialog("Modificar" + descripcion);
            	for (int i=0; i<vectorClientes.size();i++) {
            		
            		if (vectorClientes.get(i).getNombre().equals(nombre3)) {
            			
            			if (opcion == 1) {

            			Empresas empresas2 = new Empresas ();        			
                    	empresas2.setNombre(JOptionPane.showInputDialog("Nombre del cliente"));
                    	empresas2.setTelefono(JOptionPane.showInputDialog("Telefono del cliente"));
                    	empresas2.setDireccion(JOptionPane.showInputDialog("Direccion del cliente"));
                    	empresas2.setTipDoc(JOptionPane.showInputDialog("Tipo de documento"));
                    	empresas2.setDocumento(JOptionPane.showInputDialog("Documento"));
                    	empresas2.setRepresentante(JOptionPane.showInputDialog("Representante"));
                  //   	clientes.setProducto(JOptionPane.showInputDialog("Productos Cliente"));
            			vectorClientes.set(i, empresas2);
            			JOptionPane.showMessageDialog(null,"Modificado");
            			//System.out.println(vectorProducto.get(i));
            	   			}else {
            	   				Personas personas2 = new Personas ();
            	            	personas2.setNombre(JOptionPane.showInputDialog("Nombre del cliente"));
            	            	personas2.setTelefono(JOptionPane.showInputDialog("Telefono del cliente"));
            	            	personas2.setDireccion(JOptionPane.showInputDialog("Direccion del cliente"));
            	            	personas2.setCedula(JOptionPane.showInputDialog("Cedula"));
            	            	personas2.setCelular("Celular");
            	            	vectorClientes.set(i, personas2);
                    			JOptionPane.showMessageDialog(null,"Modificado");
            	   			}
            			
            			}	
            	}
	    		
	    		break;
	    	case 3:
	    		nombre3 = JOptionPane.showInputDialog("Eliminar");
            	for (int i=0; i<vectorClientes.size();i++) {
            		
            		if (vectorClientes.get(i).getNombre().equals(nombre3)) {
            			vectorClientes.remove(i);
            			JOptionPane.showMessageDialog(null,"Eliminado");
            			//System.out.println(vectorProducto.get(i));
            			}	
            	}
	    		
	    		break;
	    	case 4:
	    		nombre3 = JOptionPane.showInputDialog("consultar");
            	for (int i=0; i<vectorClientes.size();i++) {
            		
            		if (vectorClientes.get(i).getNombre().equals(nombre3)) {
            			//System.out.println(vectorClientes.get(i));
            			JOptionPane.showMessageDialog(null,vectorClientes.get(i));
            		}
            		
            	}
	    		
	    		break;
	    	case 5:
	    		salir2 = true;
	    		break;
	    	default:
	    		JOptionPane.showInternalMessageDialog(null,"La opción registrada no es valida",
	    				"Información",
	    				JOptionPane.WARNING_MESSAGE);
	    		
	    	}
	    	
	    	}
	    	catch (InputMismatchException|NumberFormatException e){
	    		JOptionPane.showMessageDialog(null, "El valor ingresado no es numerico",
	    				"Error",
	    				JOptionPane.ERROR_MESSAGE);
	    	}
	    	
	    }	
		
	}

	public static void productos() {

		String nombre3;
		boolean salir3 = false;
		//ArrayList<Producto>vectorProducto = new ArrayList <Producto>();
		
	    while (!salir3) {
	    	
	    	try {
	    	int opcion3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción:\n"
	    			    + " * 1 Agregar productos \n"
					    + " * 2 Editar productos \n"
					    + " * 3 Eliminar productos \n"
					    + " * 4 Consultar productos \n"
					    + " * 5 Salir de productos"));
	    			  
	    	switch(opcion3) {
	    	case 1:
	    		
	    		Producto producto = new Producto ();
	    		producto.setNombre(JOptionPane.showInputDialog("Nombre del Producto"));
	    		producto.setCarateristicas(JOptionPane.showInputDialog("Carateristicas Producto"));
	    		producto.setIdProducto(JOptionPane.showInputDialog("Id Producto"));
	    		producto.setCondiciones("Condiciones Productos");
	    		vectorProducto.add(producto);
	    		break;
	    		
	    	case 2:
	    		nombre3 = JOptionPane.showInputDialog("Modificar Producto");
            	for (int x=0; x<vectorProducto.size();x++) {
            		
            		if (vectorProducto.get(x).getNombre().equals(nombre3)) {
            			
            			Producto producto2 = new Producto ();
        	    		producto2.setNombre(JOptionPane.showInputDialog("Nombre del Producto"));
        	    		producto2.setCarateristicas(JOptionPane.showInputDialog("Carateristicas Producto"));
        	    		producto2.setIdProducto(JOptionPane.showInputDialog("Id Producto"));
        	    		producto2.setCondiciones("Condiciones Productos");
        	    		vectorProducto.set (x, producto2);
            			JOptionPane.showMessageDialog(null,"Modificado");
            			//System.out.println(vectorProducto.get(i));
            	   
            			}	
            	}
	    		
	    		break;
	    		
	    	case 3:
	    		nombre3 = JOptionPane.showInputDialog("Eliminar Producto");
            	for (int x=0; x<vectorProducto.size();x++) {
            		
            		if (vectorProducto.get(x).getNombre().equals(nombre3)) {
            			vectorProducto.remove(x);
            			JOptionPane.showMessageDialog(null,"Producto Eliminado");
            			//System.out.println(vectorProducto.get(i));
            			}	
            	}
	    		
	    		break;
	    	case 4:
	    		nombre3 = JOptionPane.showInputDialog("Consultar Producto");
            	for (int x=0; x<vectorProducto.size();x++) {
            		
            		if (vectorProducto.get(x).getNombre().equals(nombre3)) {
            			//System.out.println(vectorClientes.get(i));
            			JOptionPane.showMessageDialog(null,vectorProducto.get(x));
            		}
            		
            	}
	    		
	    		break;
	    	case 5:
	    		salir3 = true;
	    		break;
	    	default:
	    		JOptionPane.showInternalMessageDialog(null,"La opción registrada no es valida",
	    				"Información",
	    				JOptionPane.WARNING_MESSAGE);
	    		
	    	}
	    	
	    	}
	    	catch (InputMismatchException|NumberFormatException e){
	    		JOptionPane.showMessageDialog(null, "El valor ingresado no es numerico",
	    				"Error",
	    				JOptionPane.ERROR_MESSAGE);
	    	}
	    	
	    }	

	    
	}

	
}


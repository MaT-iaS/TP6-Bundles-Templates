package ar.edu.unju.fi.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ar.edu.unju.fi.manager.ManagerProducto;
import ar.edu.unju.fi.model.Producto;

@ManagedBean
@SessionScoped

public class AltaProdBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Producto producto;
	private String disableCodigo="false";
/*
 *llama al metodo add del manager para agregar el nuevo producto a la lista
 */
	public String aceptar(){
		System.out.println("------- aceptar");
		if(disableCodigo.equals("false")){
			ManagerProducto.productos.add(producto);
		}else{
			ManagerProducto.modificar(producto);
		}
		
		return "productList.xhtml?faces-redirect=true";
	}
	
	//instancia el objeto producto de esta clase antes de ingresar a la pagina
	public String preInsert(){
		System.out.println("--------preInsert");
		setProducto(new Producto());
		disableCodigo="false";
		return "altaProd.xhtml?faces-redirect=true";
	}
	
	public String preModif(){
		System.out.println("-------- preModif");
		disableCodigo="true";
		return "altaProd.xhtml?faces-redirect=true";
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto product) {
		this.producto = product;
	}

	public String getDisableCodigo() {
		return disableCodigo;
	}

	public void setDisableCodigo(String disableCodigo) {
		this.disableCodigo = disableCodigo;
	}

	
	
	
}
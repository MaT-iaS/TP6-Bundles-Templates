package ar.edu.unju.fi.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import ar.edu.unju.fi.manager.ManagerProducto;
import ar.edu.unju.fi.model.Producto;

@ManagedBean
@SessionScoped

public class AltaProdBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Producto producto;
	private String ok="false";
	private String alta;
/*
 *llama al metodo add del manager para agregar el nuevo producto a la lista
 */
	public String aceptar(){
		System.out.println("------- aceptar");
		ManagerProducto.productos.add(producto);
//		return "productList.xhtml?faces-redirect=true";
		return "productList";
	}
	
	//instancia el objeto producto de esta clase antes de ingresar a la pagina
	public String preInsert(){
		System.out.println("--------preInsert");
		setProducto(new Producto());
//		return "altaProd.xhtml?faces-redirect=true";
		return "altaProd";
	}

	
	public String getOk() {
		return ok;
	}
	public void setOk(String ok) {
		this.ok = ok;
	}
	public String getAlta() {
		return alta;
	}
	public void setAlta(String alta) {
		this.alta = alta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto product) {
		this.producto = product;
	}
	

}
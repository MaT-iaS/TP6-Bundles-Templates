package ar.edu.unju.fi.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import ar.edu.unju.fi.manager.ManagerProducto;
import ar.edu.unju.fi.model.Producto;



@ManagedBean
@SessionScoped
public class ProductListBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer codigo;
	private String nombre;
	private String estado;
	private List<Producto>productList;

	/**
	 * Búsqueda de productos
	 * @return
	 */
	public String search(){
		System.out.println("-------Busqueda");
		if(codigo.equals(0) && nombre.isEmpty() && estado.equals("TODO")){
			productList = ManagerProducto.productos;
		}else{
			productList=ManagerProducto.buscar(codigo, nombre, estado);
		}
					
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Buscando Productos...", "Se realizó la búsqueda de productos");
        FacesContext.getCurrentInstance().addMessage(null, message);
		return null;
	}
	
	
	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public List<Producto> getProductList() {
		return productList;
	}
	public void setProductList(List<Producto> productList) {
		this.productList = productList;
	}
	
	
}

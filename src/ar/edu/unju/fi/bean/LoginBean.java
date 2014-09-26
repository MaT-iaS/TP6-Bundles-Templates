package ar.edu.unju.fi.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ar.edu.unju.fi.manager.ManagerUsuario;
import ar.edu.unju.fi.model.Usuario;



@ManagedBean
@SessionScoped
public class LoginBean {
	public Integer dni;
	public String password;
	public String nombre;
	public String apellido;
	public String rol;
	public String error="false";	
	
	public String validar(){
		Usuario userLogueado=ManagerUsuario.validarUsuario(dni, password);
		
		
		if(userLogueado!=null){
			nombre=userLogueado.getNombre();
			apellido=userLogueado.getApellido();
			rol=userLogueado.getRol().getDescripcion();
			return "productList?faces-redirect=true";
		}else{
			error="true";
			return null;
		}
	}
	
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
}
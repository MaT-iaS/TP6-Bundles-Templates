package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Rol;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.model.constant.EstadoUsuario;

public class ManagerUsuario {
	public static List<Usuario> usuarios;
	static{
		if (usuarios == null){
			Rol vendedor = new Rol(0, "VENDEDOR");
			Rol administrador = new Rol(1, "ADMINISTRADOR");
			usuarios = new ArrayList<Usuario>();
			usuarios.add(new Usuario(1111, "Maria", "Tinte", "1111", "ACTIVO", vendedor));
			usuarios.add(new Usuario(2222, "Liliana", "Cruz", "2222","NO ACTIVO", vendedor));
			usuarios.add(new Usuario(3333, "Pedro", "Sajama", "3333", "ACTIVO", vendedor));
			usuarios.add(new Usuario(4444, "Carlos", "Mamani", "4444", "NO ACTIVO", administrador));
			usuarios.add(new Usuario(5555, "Rosana", "Mendez", "5555", "ACTIVO", administrador));
		}
	}
	
	public static Usuario validarUsuario(Integer dni, String pass){
		for (Usuario u : usuarios) {
			if (u.getDocumento().equals(dni)&& u.getEstado().equals(EstadoUsuario.ACTIVO) && u.getPassword().equals(pass)){
				return u;
			}
		}
		return null;
	}

}

package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unju.fi.model.Producto;



public class ManagerProducto {
	public static List<Producto> productos;	
	static{
		if (productos == null){			
			productos = new ArrayList<Producto>();
			productos.add(new Producto(1,"C-COLA CHICA", "COCA COLA CHICA", "350", new Date(), 2d ,12d, 30, "DISPONIBLE"));
			productos.add(new Producto(2,"C-COLA MEDIANA", "COCA COLA MEDIANA", "1000", new Date(), 5d,30d,30,"DISPONIBLE"));
			productos.add(new Producto(3,"FANTA CHICA","FANTA CHICA","350",new Date(), 2d, 12d,30,"DISPONIBLE"));
			productos.add(new Producto(4,"SPRITE MEDIANA","SPRITE MEDIANA", "1000", new Date(), 5d, 30d, 30, "NO DISPONIBLE"));
			productos.add(new Producto(5,"SPRITE GRANDE","SPRITE GRANDE", "2250", new Date(), 15d, 50d, 20, "DISPONIBLE"));
			productos.add(new Producto(7,"FANTA MEDIANA","FANTA MEDIANA", "1000", new Date(), 5d, 30d, 20, "NO DISPONIBLE"));
			productos.add(new Producto(8,"FANTA GRANDE","FANTA GRANDE", "2250", new Date(), 15d, 50d, 40, "NO DISPONIBLE"));
			productos.add(new Producto(9,"PASOS DE LOS TOROS MEDIANA","PASOS DE LOS TOROS", "1000", new Date(), 5d, 30d, 10, "DISPONIBLE"));
			productos.add(new Producto(10,"PASOS DE LOS TOROS GRANDE","PASOS DE LOS TOROS", "2000", new Date(), 12d, 25d, 15, "DISPONIBLE"));
			productos.add(new Producto(11,"MIRINDA NARANJA","MIRINDA NARANJA", "1200", new Date(), 7d, 32d, 15, "DISPONIBLE"));
			productos.add(new Producto(12,"MIRINDA MANZANA","MIRINDA MANZANA", "1200", new Date(), 7d, 32d, 20, "DISPONIBLE"));
		}
	}

	public static List<Producto> buscar(Integer codigo, String nombre, String estado){
		List<Producto> encontrados=new ArrayList<Producto>();
		
		for(Producto p : productos){
			if(p.getCodigo().equals(codigo) || (p.getNombre().contains(nombre)	&& !nombre.isEmpty()) || (p.getEstado().equals(estado) && !estado.equals("TODO")) ){
				encontrados.add(p);
			}
		}
		return encontrados;
	}
	
	public static void add(Producto p){
		productos.add(p);
	}
	
	public static void modificar(Producto prod){
		Boolean done=false;
		for (int i=0; i<productos.size()&&!done;i++) {
			if(productos.get(i).getCodigo()==prod.getCodigo()){
				productos.remove(i);
				done=true;
			}
		}
		productos.add(prod);
	}
	
}

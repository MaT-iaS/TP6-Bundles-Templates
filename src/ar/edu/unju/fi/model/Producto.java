package ar.edu.unju.fi.model;

import java.util.Date;

public class Producto {
	private Integer codigo;
	private String nombre;
	private String descripcion;
	private String tamanio;
	private	Date fechaVencimiento;
	private Double precioUnitario;
	private Double precioFardo;
	private Integer stock;
	private String estado;
	
	public Producto() {
	}
	public Producto(Integer codigo, String nombre, String descripcion,String tamanio, Date fechaVencimiento, Double precioUnitario, Double precioFardo, Integer stock, String estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tamanio = tamanio;
		this.fechaVencimiento = fechaVencimiento;
		this.precioUnitario = precioUnitario;
		this.precioFardo = precioFardo;
		this.stock = stock;
		this.estado = estado;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Double getPrecioFardo() {
		return precioFardo;
	}
	public void setPrecioFardo(Double precioFardo) {
		this.precioFardo = precioFardo;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}

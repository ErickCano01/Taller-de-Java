package Pack;

import java.io.Serializable;

public class Producto implements Serializable{
	private String nombre;
	private float precio;
	private float dinero;
	private int stock;
	
	public Producto() {
		
	}
	public Producto(String nombre,int stock ,float precio,float dinero) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.dinero = dinero;
	}
	public Producto(String nombre,int stock ,float precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getDinero() {
		return dinero;
	}
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return this.nombre.toUpperCase()+" "+this.stock+" "+this.precio+"\n";
	}

}

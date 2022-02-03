package delivery;

public class Pack { //Pack de verduras en venta

	private int id;
	private String descripcion;
	private int unidades;
	private int precio;
	
	
	public Pack(int id, String descripcion, int unidades, int precio) {
		
		this.id = id;
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.precio = precio;
		
		}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}

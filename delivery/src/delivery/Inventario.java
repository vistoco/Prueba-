package delivery;

public class Inventario {

	private int stock;
	private Producto producto;
	
	
	public Inventario(int stock, Producto producto) {
		super();
		this.stock = stock;
		this.producto = producto;
			}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

}

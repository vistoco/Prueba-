package delivery;

public class Despacho {

	private int numeroDespacho;
	private String nota;
	private Cliente cliente;
	private Venta venta;
	
	
	public Despacho(int numeroDespacho, String nota, Cliente cliente, Venta venta) {
		
		this.numeroDespacho = numeroDespacho;
		this.nota = nota;
		this.cliente = cliente;
		this.venta = venta;
		
		
	}


	public int getNumeroDespacho() {
		return numeroDespacho;
	}


	public void setNumeroDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}


	public String getNota() {
		return nota;
	}


	public void setNota(String nota) {
		this.nota = nota;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Venta getVenta() {
		return venta;
	}


	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	
	
	
}

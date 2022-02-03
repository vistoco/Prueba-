package delivery;

import java.util.ArrayList;

public class Venta {
		private int cantidadPack;
		private int monto;
		private int idVenta;
		private Cliente cliente;
		private ArrayList<Pack> pack; 
		private ArrayList<Producto> producto;
		
		
		public Venta(int cantidadPack, int monto, int idVenta, Cliente cliente, ArrayList<Pack> pack,
				ArrayList<Producto> producto) {
			
			this.cantidadPack = cantidadPack;
			this.monto = monto;
			this.idVenta = idVenta;
			this.cliente = cliente;
			this.pack = pack;
			this.producto = producto;
		}


		public int getCantidadPack() {
			return cantidadPack;
		}


		public void setCantidadPack(int cantidadPack) {
			this.cantidadPack = cantidadPack;
		}


		public int getMonto() {
			return monto;
		}


		public void setMonto(int monto) {
			this.monto = monto;
		}


		public int getIdVenta() {
			return idVenta;
		}


		public void setIdVenta(int idVenta) {
			this.idVenta = idVenta;
		}


		public Cliente getCliente() {
			return cliente;
		}


		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}


		public ArrayList<Pack> getPack() {
			return pack;
		}


		public void setPack(ArrayList<Pack> pack) {
			this.pack = pack;
		}


		public ArrayList<Producto> getProducto() {
			return producto;
		}


		public void setProducto(ArrayList<Producto> producto) {
			this.producto = producto;
		}
		
}
		
		
		
		
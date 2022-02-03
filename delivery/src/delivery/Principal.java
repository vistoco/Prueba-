package delivery;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("      Verdureria Maduros      ");
		System.out.println("------------------------------");
		
		Cliente cliente = new Cliente ("Victor", "Pajaritos 3434", 56568568);
		Cliente cliente2 = new Cliente ("Eduardo", "Diademas 133", 465456446);
		
		Pack pack = new Pack (1, "Surtido", 10, 15000);
		Pack pack2 = new Pack (2, "Frutas", 5, 2500);
		
		Producto producto = new Producto (111, "Tomate", 1000);
		Producto producto2 = new Producto (222, "Platano", 500);
		
		Inventario inventario = new Inventario(30, producto);
		Inventario inventario2 = new Inventario(12, producto2);
		
		Venta venta = new Venta(3, 13500, 001, cliente, new ArrayList<Pack>(), new ArrayList<Producto>());
		Venta venta2 = new Venta(15, 22000, 123, cliente2, new ArrayList<Pack>(), new ArrayList<Producto>());
		
		Proveedores proveedores = new Proveedores ("Los zorrillos", "15932482-5", 45685440);
		
		Despacho despacho = new Despacho (1111111, "Llamar para abrir porton", cliente2, venta);
		Despacho despacho2 = new Despacho (00000005, "Dejar en concerjeria", cliente, venta2);
		
		venta.getPack().add(pack);
		venta.getPack().add(pack2);
		venta.getProducto().add(producto);
		venta.getProducto().add(producto2);
		
		String Pack = "";
		for (int i=0; i < venta.getPack().size(); i++) {
			Pack = pack + venta.getProducto().get(i).getNombre() + ",";
		}
		
				
		System.out.println("\n---Venta lista para despacho--- \n\n"  + "-" + "Id venta: " + venta.getIdVenta() + "\n" + "-" + "Tipo de pack: " + pack.getDescripcion() + "\n" + "-" + "Por el monto de: " + venta.getMonto() + "\n" + "-" + "Pack vendidos: " + venta.getCantidadPack()+ "\n" + "-" + "Direccion de Despacho: " + despacho.getCliente().getDireccion() + "\n" + "-" + "Nota para despacho: " + despacho.getNota() + "\n" + "-" + "Telefono cliente: " + despacho.getCliente().getTelefono());
	
		System.out.println("\n---Venta en proceso de armado--- \n\n"  + "-" + "Id venta: " + venta2.getIdVenta() + "\n" + "-" + "Tipo de pack: " + pack2.getDescripcion() + "\n" + "-" + "Por el monto de: " + venta2.getMonto() + "\n" + "-" + "Pack vendidos: " + venta2.getCantidadPack()+ "\n" + "-" + "Direccion de Despacho: " + despacho2.getCliente().getDireccion() + "\n" + "-" + "Nota para despacho: " + despacho2.getNota() + "\n" + "-" + "Telefono cliente: " + despacho2.getCliente().getTelefono());
	
	}
}
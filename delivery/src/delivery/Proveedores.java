package delivery;

public class Proveedores { //Entrada de verduras

	private String nombreEmpresa;
	private String rut;
	private int telefono;
	
	public Proveedores(String nombreEmpresa, String rut, int telefono) {
		
		
		this.nombreEmpresa = nombreEmpresa;
		this.rut = rut;
		this.telefono = telefono;
		
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
}



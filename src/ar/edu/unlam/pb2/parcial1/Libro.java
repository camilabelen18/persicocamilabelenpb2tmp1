package ar.edu.unlam.pb2.parcial1;

public class Libro extends Producto implements Vendible{

	private String autorEsperado;
	private String editorialEsperada;
	private Double precioVenta;

	public Libro(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, String aUTOR_ESPERADO,
			String eDITORIAL_ESPERADA) {
		super(cODIGO_ESPERADO,dESCRIPCION_ESPERADA);
		this.autorEsperado = aUTOR_ESPERADO;
		this.editorialEsperada = eDITORIAL_ESPERADA;
	}
	
	

	public String getAutor() {
		return this.autorEsperado;
	}

	public String getEditorial() {
		return this.editorialEsperada;
	}



	@Override
	public void setPrecioVenta(Double pRECIO_VENTA) {
		this.precioVenta = pRECIO_VENTA;
	}



	@Override
	public Double getPrecioVenta() {
		return this.precioVenta;
	}
	
		
	
	
	
	

}

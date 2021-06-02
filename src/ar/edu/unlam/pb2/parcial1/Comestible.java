package ar.edu.unlam.pb2.parcial1;

public class Comestible extends Producto implements Vendible{

	private Double precioVenta;

	public Comestible(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA) {
		super(cODIGO_ESPERADO,dESCRIPCION_ESPERADA);
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

package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Producto implements Alquilable{


	private TipoDeConsola tipo;
	private Double precioAlquiler;

	public Videojuego(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, TipoDeConsola cONSOLA_ESPERADA) {
		super(cODIGO_ESPERADO,dESCRIPCION_ESPERADA);
		this.tipo = cONSOLA_ESPERADA;
	}

	
	public TipoDeConsola getTipo() {
		return this.tipo;
	}


	@Override
	public void setPrecioAlquiler(Double pRECIO_ALQUILER) {
		this.precioAlquiler = pRECIO_ALQUILER;
	}


	@Override
	public Double getPrecioAlquiler() {
		return this.precioAlquiler;
	}
	
	
	
	
	
	

	
}

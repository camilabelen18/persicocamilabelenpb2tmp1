package ar.edu.unlam.pb2.parcial1;

public class Producto {

	private Integer codigoEsperado;
	private String descripcionEsperada;
	
	public Producto(Integer codigoEsperado, String descripcionEsperada) {
		this.codigoEsperado = codigoEsperado;
		this.descripcionEsperada = descripcionEsperada;
	}

	public Integer getCodigoEsperado() {
		return codigoEsperado;
	}

	public void setCodigoEsperado(Integer codigoEsperado) {
		this.codigoEsperado = codigoEsperado;
	}

	public String getDescripcionEsperada() {
		return descripcionEsperada;
	}

	public void setDescripcionEsperada(String descripcionEsperada) {
		this.descripcionEsperada = descripcionEsperada;
	}
	
	
}

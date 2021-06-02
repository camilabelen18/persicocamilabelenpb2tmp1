package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public  class Producto {

	private Integer codigoEsperado;
	private String descripcionEsperada;
	private Estado estado;
	
	public Producto(Integer codigoEsperado, String descripcionEsperada) {
		this.codigoEsperado = codigoEsperado;
		this.descripcionEsperada = descripcionEsperada;
		this.estado = Estado.DISPONIBLE;
	}

	public Estado getEstadoActual() {
		return this.estado ;
	}
	
	public void setEstadoActual(Estado estadoActual) {
		this.estado=estadoActual ;
	}
	
	public Cliente getQuienPoseeElProducto() {
		return null;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoEsperado == null) ? 0 : codigoEsperado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigoEsperado == null) {
			if (other.codigoEsperado != null)
				return false;
		} else if (!codigoEsperado.equals(other.codigoEsperado))
			return false;
		return true;
	}

	







	

	
}

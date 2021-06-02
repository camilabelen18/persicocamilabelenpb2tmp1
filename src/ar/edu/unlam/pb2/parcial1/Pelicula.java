package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Producto implements Vendible,Alquilable{

	private Genero tipo;
	private Integer anioDeEstrenoEsperado;
	private String directorEsperado;
	private Double precioVenta;
	
	private List<String> listaDeActores;
	private Double precioAlquiler;

	public Pelicula(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, Genero gENERO_ESPERADO,
			Integer aNO_DE_ESTRENO_ESPERADO, String dIRECTOR_ESPERADO) {
		super(cODIGO_ESPERADO,dESCRIPCION_ESPERADA);
		this.tipo = gENERO_ESPERADO;
		this.anioDeEstrenoEsperado = aNO_DE_ESTRENO_ESPERADO;
		this.directorEsperado = dIRECTOR_ESPERADO;
		
		this.listaDeActores = new ArrayList<>();
	}

	public void agregarActor(String aCTOR_1_ESPERADO) {
		this.listaDeActores.add(aCTOR_1_ESPERADO);
		
	}
	
	public Boolean actua(String aCTOR_1_ESPERADO) {
		if(this.listaDeActores.contains(aCTOR_1_ESPERADO)) {
			return true;
		}
		return false;
	}

	
	public Genero getGenero() {
		return this.tipo;
	}

	public Integer getAnoDeEstreno() {
		return this.anioDeEstrenoEsperado;
	}

	public String getDirector() {
		return this.directorEsperado;
	}

	@Override
	public void setPrecioVenta(Double pRECIO_VENTA) {
		this.precioVenta = pRECIO_VENTA;
	}

	@Override
	public Double getPrecioVenta() {
		return this.precioVenta;
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

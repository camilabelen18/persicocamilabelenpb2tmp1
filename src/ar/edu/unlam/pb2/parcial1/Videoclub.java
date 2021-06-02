package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Videoclub {

	private String nombreVideoclub;
	private List<Producto> listaDeProductos;	
	private List<Producto> listaDeVentas;
	private List<Cliente> listaDeCliente;
	private List<Producto> listaDeAlquileres;
	private Producto nuevoProducto;
	

	public Videoclub(String nOMBRE_VIDEOCLUB) {
		this.nombreVideoclub = nOMBRE_VIDEOCLUB;
		this.listaDeProductos = new ArrayList<Producto>();
		this.listaDeVentas = new ArrayList<Producto>();
		this.listaDeCliente = new ArrayList<Cliente>();
		this.listaDeAlquileres = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.listaDeProductos.add(nuevoProducto);
	}
	
	public void agregarCliente(Cliente nuevoCliente) {
		this.listaDeCliente.add(nuevoCliente);
	}


	public Producto buscarProducto(Producto nuevoProducto) {
		
		for (Producto producto : listaDeProductos) {
			if(producto.equals(nuevoProducto)) {
				return producto;
			}
		}
		
		return null;
	}

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		
		if(buscarProducto(nuevoProducto)!=null && buscarCliente(nuevoCliente) != null) {
			if(nuevoProducto instanceof Pelicula || nuevoProducto instanceof Libro || nuevoProducto instanceof Comestible) {
				nuevoProducto.setEstadoActual(Estado.VENDIDO);
				return this.listaDeVentas.add(nuevoProducto);
			}
		}
		return false;
	}

	private Cliente buscarCliente(Cliente nuevoCliente) {

		for (Cliente cliente : listaDeCliente) {
			if(cliente.equals(nuevoCliente)) {
				return cliente;
			}
		}

		return null;
	}

	public Boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) {
		if(buscarProducto(nuevoProducto)!=null && buscarCliente(nuevoCliente) != null) {
			if(nuevoProducto instanceof Pelicula || nuevoProducto instanceof Videojuego) {
				nuevoProducto.setEstadoActual(Estado.ALQUILADO);
				return this.listaDeAlquileres.add(nuevoProducto);
			}
		}
		return false;
	}
	
	
	
	

	
}

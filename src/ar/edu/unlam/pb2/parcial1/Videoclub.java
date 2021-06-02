package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {

	private String nombreVideoclub;
	private List<Producto> listaDeProductos;

	public Videoclub(String nOMBRE_VIDEOCLUB) {
		this.nombreVideoclub = nOMBRE_VIDEOCLUB;
		this.listaDeProductos = new ArrayList<>();
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.listaDeProductos.add(nuevoProducto);
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		
		
		return null;
	}

}

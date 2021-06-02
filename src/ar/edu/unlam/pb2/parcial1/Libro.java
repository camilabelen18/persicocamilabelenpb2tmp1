package ar.edu.unlam.pb2.parcial1;

public class Libro extends Producto{

	private String autorEsperado;
	private String editorialEsperada;

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
	
		
	
	
	
	

}

package ar.edu.unlam.pb2.parcial1;

public class Cliente {
	

		private Integer cODIGO_ESPERADO;
		private String aPELLIDO_ESPERADO;
		private String nOMBRE_ESPERADO;
		private Integer eDAD_ESPERADA;

		public Cliente(Integer cODIGO_ESPERADO, String aPELLIDO_ESPERADO, String nOMBRE_ESPERADO, Integer eDAD_ESPERADA) {
			this.cODIGO_ESPERADO = cODIGO_ESPERADO;
			this.aPELLIDO_ESPERADO = aPELLIDO_ESPERADO;
			this.nOMBRE_ESPERADO = nOMBRE_ESPERADO;
			this.eDAD_ESPERADA = eDAD_ESPERADA;
		}

		public Integer getCodigo() {
			return this.cODIGO_ESPERADO;
		}

		public String getNombre() {
			return this.nOMBRE_ESPERADO;
		}

		public String getApellido() {
			return this.aPELLIDO_ESPERADO;
		}

		public Integer getEdad() {
			return this.eDAD_ESPERADA;
		}


}

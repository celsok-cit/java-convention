package br.com.ciandt.mhiroshi.service;

/**
 * classe de servo�o para comentarios
 * @author mhiroshi
 * 
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Coment�rio removido!"); 

	public ComentarioService() {
	
	}

	/**
	 * metodo para verificar se existe algum coment�rio, se o valor da (String comentario) � diferente de nulo.
	 * @param comentario - {@link String} coment�rio recebido como texto
	 * @return 
	 */
	public Boolean verificarComentario(String comentario) {
		
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	
	/**
	 * metodo para retornar valor
	 * @return 
	 */
	public String Remover() {
		return COMENTARIO_REMOVIDO;		
	}
}

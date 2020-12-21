package br.com.ciandt.mhiroshi.service;

/**
 * classe de servoço para comentarios
 * @author mhiroshi
 * 
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!"); 

	public ComentarioService() {
	
	}

	/**
	 * metodo para verificar se existe algum comentário, se o valor da (String comentario) é diferente de nulo.
	 * @param comentario - {@link String} comentário recebido como texto
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

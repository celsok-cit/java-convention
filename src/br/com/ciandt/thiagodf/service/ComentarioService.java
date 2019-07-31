package br.com.ciandt.thiagodf.service;

/**
 * Classe de serviço para comentário.
 * 
 * @author thiagodf
 *
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!"); 

/**
 * Método construtor Comentário Service.
 * 	
 */
	public ComentarioService() {}

/**
 * Método que verifica se o comentário é nullo.
 * 
 * @param comentario
 * @return Boolean
 */
	public Boolean verificaComentario(String comentario) {
		
		// verifica se o comentário é diferente de null
		if (comentario != null) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	
/**
 * Método que remove o comentário.
 * 
 * @return
 */
	public String remover() {
		return COMENTARIO_REMOVIDO;		
	}
}

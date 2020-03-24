package br.com.ciandt.mshen.service;

/**
*Classe de serviço de comentário.
*/
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!"); 
/**
* Método construtor
*/	
public ComentarioService() {}
	
        /**
	 * Método que verifica se o comentário está nulo.
	 * @param comentario - {@link String} variavel
	 * @return verdadeiro ou falso
	 */
	public Boolean adicionarLike (String comentario) {
		//verifica se o comentario é diferente de nulo
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}

         /**
	 * Método que retorna remoção de um comentário.
	 * @return comentário removido
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;		
	}
}

package br.com.ciandt.csartini.service;

/**
* Método que realiza a remoção do comentário
* Exemplo: {@code Boolean seraExcluidoSe = comentarioRemovido(comentario)
* @param comentario {@link} variavel
* @return se verdadeiro ou falso
* 
* @author csartini
**/

/**
 * metodo construtor acima
 * 
 * @author csartini
 *
 */
public class ComentarioService {

	/**
	 * Método que realiza a remoção do comentário Exemplo:
	 * {@code Boolean seraExcluidoSe = comentarioRemovido(comentario) @param
	 * comentario {@link} variavel
	 * 
	 * @return se verdadeiro ou falso
	 * 
	 * @author csartini
	 **/
	private final static String COMENTARIO_REMOVIDO = new String("Comentario removido!");

	public void comentarioService() {
	}

	/**
	 * Método que realiza a adição de likes Exemplo:
	 * {@code Boolean seraAdicionado = adicionarLike(comentario) @param comentario
	 * {@link} variavel
	 * 
	 * @return se verdadeiro ou falso
	 * 
	 * @author csartini
	 **/
	public Boolean adicionarLike(String comentario) {

// verifica se a variável comentario é nula ou não 
		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

	public String remover() {
		return COMENTARIO_REMOVIDO;
	}
}

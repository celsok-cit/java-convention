package br.com.ciandt.ewerton.service;

/**
 * Class veryfi comments
 * 
 * @author ewerton
 *
 */
public class ComentarioService {

	private final static String comentarioRemovido = new String("Comentario removido!");

	/**
	 * builder Method
	 */
	public ComentarioService() {
	}

	/**
	 * This method verify if likes was added
	 * 
	 * @param comentario - {@link String}
	 * @return Boolean
	 */
	public Boolean adicionarComentario(String comentario) {

		// Adding comment
		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}

	/**
	 * This method verify if coment was removed
	 * @return comentarioRemovido {@link String}
	 */
	public String remover() {
		return comentarioRemovido;
	}
}

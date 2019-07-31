package br.com.ciandt.waldinei.service;

/**
 * Classe de serviços para comentário
 * @author waldinei
 */
public class ComentarioService {
	/**
	 * Interface para retorno do comentário
	 * @return Boolean - status comentário
	 */
	private final static String comentarioRemovido = new String("Comentário removido!");

	public ComentarioService() {
	}

	public Boolean Adicionarlike(String comentario) {

		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

	public String _remover10() {
		return comentarioRemovido;
	}
}

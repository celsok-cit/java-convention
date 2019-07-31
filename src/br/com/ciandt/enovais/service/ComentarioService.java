package br.com.ciandt.enovais.service;

/**
 * Classe de serviços para comentários Método Adicionarlike verifica que há uma
 * String nula
 * 
 * @author enovais
 */
public class ComentarioService {

	private final static String comentarioRemovido = new String("Comentário removido!");

	public ComentarioService() {
	}

	public Boolean Adicionarlike(String comentario) {
		// se comentário for diferente de nulo, retorna true
		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

	// remove o comentário
	public String remover() {
		return comentarioRemovido;
	}
}
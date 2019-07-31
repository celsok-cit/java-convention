package br.com.ciandt.joycelf.service;

/**
 * Classe que controla os comentários
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Coment�rio removido!");

	/*
	 * Construtor da classe
	 */
	public ComentarioService() {}

	/**
	 * Adiciona like
	 * @param comentario
	 * @return true ou false
	 */
	public Boolean adicionarLike(String comentario) {
		// verifica se o comentario está nulo
		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}

	/**
	 * Notifica que um comentário foi removido
	 * 
	 * @return string de comentário removido
	 */
	public String _removerComentario() {
		return COMENTARIO_REMOVIDO;
	}
}

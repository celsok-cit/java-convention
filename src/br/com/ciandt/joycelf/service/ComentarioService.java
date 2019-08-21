package br.com.ciandt.joycelf.service;

/**
 * 
 * @author joycelf
 *Classe de serviço para comentários
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Coment�rio removido!");

	/*
	 * Construtor da classe
	 */
	public ComentarioService() {}

	/**
	 * Verifica se o comentário está nulo
	 * @param comentario
	 * @return true ou false
	 */
	public Boolean verificaComentario(String comentario) {
		// verifica se o comentario está nulo
		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}

	/**
	 * Notifica que um comentário foi removido
	 * @return string de comentário removido
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;
	}
}

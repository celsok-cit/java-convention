package br.com.ciandt.enovais.service;

/**
 * Classe de serviço de comentários, a mesma usa de recursos para manipular comentários
 * @author enovais
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!");

	public ComentarioService() {
	}
	
	/**
	 * 
	 * @param comentario - Verifica se o comentário foi setado
	 * @return True em caso de algum comentário atribuido, e False em caso de não houver comentários
	 */
	public Boolean verificarComentario(String comentario) {

		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

	/**
	 * 
	 * @return Remove o comentário setando "Comentário removido!" por cima do anterior
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;
	}
}
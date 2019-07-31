package br.com.ciandt.waldinei.service;

/**
 * Classe de serviços para comentário
 * 
 * @author waldinei
 */
public class ComentarioService {
	/**
	 * Interface para retorno do comentário
	 * 
	 * @return Boolean - status comentário
	 */
	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!");

	public ComentarioService() {
	}

	public Boolean verificar_comentário(String comentario) {

		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

	public String remover() {
		return COMENTARIO_REMOVIDO;
	}
}

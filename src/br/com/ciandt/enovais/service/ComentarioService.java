package br.com.ciandt.enovais.service;

/**
 * Classe de servi�o de coment�rios, a mesma usa de recursos para manipular coment�rios
 * @author enovais
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Coment�rio removido!");

	public ComentarioService() {
	}
	
	/**
	 * 
	 * @param comentario - Verifica se o coment�rio foi setado
	 * @return True em caso de algum coment�rio atribuido, e False em caso de n�o houver coment�rios
	 */
	public Boolean verificarComentario(String comentario) {

		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

	/**
	 * 
	 * @return Remove o coment�rio setando "Coment�rio removido!" por cima do anterior
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;
	}
}
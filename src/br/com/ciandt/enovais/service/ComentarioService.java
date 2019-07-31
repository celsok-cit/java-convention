package br.com.ciandt.enovais.service;

/**
 * Classe de servi�os para coment�rios M�todo Adicionarlike verifica que h� uma
 * String nula
 * 
 * @author enovais
 */
public class ComentarioService {

	private final static String comentarioRemovido = new String("Coment�rio removido!");

	public ComentarioService() {
	}

	public Boolean Adicionarlike(String comentario) {
		// se coment�rio for diferente de nulo, retorna true
		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;

	}

	// remove o coment�rio
	public String remover() {
		return comentarioRemovido;
	}
}
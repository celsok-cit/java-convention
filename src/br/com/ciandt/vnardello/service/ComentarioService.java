package br.com.ciandt.vnardello.service;

/*
 * Metodo que retorna se a mensagem � null ou n�o
 *Exemplo {Se o comentario for nulo, o metodo retorna falso} 
 *@param comentario - {Passa uma String por parametro}
 *return 
 */
public class ComentarioService {

	private final static String COMENTARIO_RESOLVIDO = new String("Coment�rio removido!");

	public ComentarioService() {
	}

	public Boolean adicionarLike(String comentario) {
		
		//Se o comentario for diferente de null, o retorno vai ser TRUE, senao, retorna FALSE
		if (comentario != null) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}
	
	//Avisa que o comentario foi removido
	public String remover() {
		return COMENTARIO_RESOLVIDO;
	}
}
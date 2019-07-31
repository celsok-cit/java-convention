package br.com.ciandt.vnardello.service;

/*
 * Metodo que retorna se a mensagem é null ou não
 * Exemplo {Se o comentario for nulo, o metodo retorna falso} 
 * return comentario
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!");

	public ComentarioService() {}
	
	/*
	 * @param comentario - {Passa uma String por parametro}
	 * 
	 */
	public Boolean verificarComentario(String comentario) {
		
		//Se o comentario for diferente de null, o retorno vai ser TRUE, senao, retorna FALSE
		if(comentario != null) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
	/*
	 * Avisa que o comentario foi removido
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;
	}
}
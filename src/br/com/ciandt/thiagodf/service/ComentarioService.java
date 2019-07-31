package br.com.ciandt.thiagodf.service;

/**
 * Classe de serviço para comentários.
 * 
 * @author thiagodf
 *
 */
public class ComentarioService {

	private final static String comentarioRemovido = new String("Comentário removido!"); 

/**
 * Método construtor.
 * 	
 */
	public void comentarioService() {}

/**
 * Método que adiciona like.
 * @param comentario
 * @return Bollean
 */
	public Boolean adicionarlike (String comentario) 
	{
		// verifica se o comentário é diferente de null
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	public String remover(){
		return comentarioRemovido;		
	}
}

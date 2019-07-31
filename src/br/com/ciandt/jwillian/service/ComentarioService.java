package br.com.ciandt.jwillian.service;

/**
 * Classe de serviços para comentários
 * @author jwillian
 */
public class ComentarioService {

	//Metodo de criação da constante "COMENTÁRIO_REMOVIDO" tipo String
	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!"); 


	//Metodo contrutor da classe
	 public ComentarioService() {}
	
	/**
	 * Metodo que verifica o comentario
	 * @param comentario {@link String} comentário
	 * @return true caso valor diferente de null ou false se for null
	 */
	public Boolean verificarComentario (String comentario) 
	{
		//if que verifica se o valor do comentário é diferente de nulo
		if(comentario != null) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	
	/**
	 * Metodo que remove comentario
	 * @return comentário removido
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;		
	}
}

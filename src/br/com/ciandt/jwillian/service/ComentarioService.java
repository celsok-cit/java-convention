package br.com.ciandt.jwillian.service;

/**
 * Classe de serviços para comentários
 * @author jwillian
 */
public class ComentarioService {


	private final static String COMENTARIO_REMOVIDO = new String("Comentário removido!"); 


	/**
	 * Metodo contrutor da classe
	 */
	public ComentarioService() {}
	
	/**
	 * Metodo que verificar o comentario
	 * @param comentario {@link String} comentário
	 * @return true caso valor diferente de null ou false se for null
	 */
	public Boolean verificarComentario (String comentario) 
	{
		
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	
	/**
	 * Metodo que remove comentario
	 * @return comentário removido
	 */
	public String remover(){
		return COMENTARIO_REMOVIDO;		
	}
}

package br.com.ciandt.jwillian.service;

/**
 * Classe de servi�os para coment�rios
 * @author jwillian
 */
public class ComentarioService {

	//Metodo de cria��o da constante "COMENT�RIO_REMOVIDO" tipo String
	private final static String COMENTARIO_REMOVIDO = new String("Coment�rio removido!"); 


	//Metodo contrutor da classe
	 public ComentarioService() {}
	
	/**
	 * Metodo que verifica o comentario
	 * @param comentario {@link String} coment�rio
	 * @return true caso valor diferente de null ou false se for null
	 */
	public Boolean verificarComentario (String comentario) 
	{
		//if que verifica se o valor do coment�rio � diferente de nulo
		if(comentario != null) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	
	/**
	 * Metodo que remove comentario
	 * @return coment�rio removido
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;		
	}
}

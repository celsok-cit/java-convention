package br.com.ciandt.mshen.service;

/**
*Classe de servi�o de coment�rio.
*/
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Coment�rio removido!"); 
/**
* M�todo construtor
*/	
public ComentarioService() {}
	
        /**
	 * M�todo que verifica se o coment�rio est� nulo.
	 * @param comentario - {@link String} variavel
	 * @return verdadeiro ou falso
	 */
	public Boolean adicionarLike (String comentario) {
		//verifica se o comentario � diferente de nulo
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}

         /**
	 * M�todo que retorna remo��o de um coment�rio.
	 * @return coment�rio removido
	 */
	public String remover() {
		return COMENTARIO_REMOVIDO;		
	}
}

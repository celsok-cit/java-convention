package br.com.ciandt.mhiroshi.service;

/**
 * classe de servo�o para comentarios
 * @author mhiroshi
 * 
 */
public class ComentarioService {

	private final static String COMENTARIO_REMOVIDO = new String("Coment�rio removido!"); 
	
public ComentarioService() {
	
}
	/**
	 * metodo para adicionar um 'like'
	 * @param comentario - {@link If} variavel boolean
	 * @return ira verificar se [e verdadeiro ou falso, se valor for verdadeiro, a fun��o ir� adicionar um 'like'"
	 */
	public Boolean Adicionarlike (String comentario) 
	{
		
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	/**
	 * metodo para retornar valor
	 * @return 
	 */
	public String Remover(){
		return COMENTARIO_REMOVIDO;		
	}
}

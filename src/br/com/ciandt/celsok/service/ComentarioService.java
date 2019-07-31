package br.com.ciandt.celsok.service;

public class ComentarioService {

	private final static String comentarioRemovido = new String("Comentário removido!"); 
	
public ComentarioService() {}
	
	public Boolean Adicionarlike (String comentario) 
	{
		
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	public String _remover10(){
		return comentarioRemovido;		
	}
}

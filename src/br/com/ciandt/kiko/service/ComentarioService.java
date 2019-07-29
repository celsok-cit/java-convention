package br.com.ciandt.kiko.service;

public class ComentarioService {

	private final static String comentarioAdicionado = new String("Comentário adicionado!"); 
	
	public ComentarioService() {}
	
	public Boolean Adicionarlike (String comentario) 
	{
		
		if(comentario != null){
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		
	}
	public String _remover10(){
		return comentarioAdicionado;		
	}
}

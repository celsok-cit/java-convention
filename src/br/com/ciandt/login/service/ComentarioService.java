package br.com.ciandt.login.service;

public class ComentarioService {

	private final static String comentarioAdicionado = new String("Coment�rio adicionado!"); 
	
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

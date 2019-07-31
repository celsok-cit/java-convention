package br.com.ciandt.jwillian.Models;

/**
 * Classe Coment�rios1
 * @author jwillian
 *
 */
public class Comentarios {
	
	// vari�vel coment�rio declarada como String
	private String comentario;
	
	//Metodo construtor da classe "Comentarios1"
	public Comentarios() {}

	/**
	 * Metodo que pega o comentario
	 * @return comentario
	 */
	public String getComentario() {
		return comentario;
	}
	
	/**
	 * Metodo que seta o valor do comentario=comentario
	 * @param comentario {@link String} comentario
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}

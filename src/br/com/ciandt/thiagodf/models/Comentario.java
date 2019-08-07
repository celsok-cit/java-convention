package br.com.ciandt.thiagodf.models;

/**
 * Classe de Comentário.
 * 
 * @author thiagodf
 *
 */
public class Comentario {

	private String comentario;
	
	/**
	 * Método Construtor para comentário.
	 *
	 */
	public Comentario() {}
	
	/**
	 * Método que retorna o comentário.
	 * 
	 * @return String
	 */
	public String getComentario() {
		return comentario;
	}
	
	/**
	 * Método que declara o comentário.
	 * 
	 * @param comentario
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}

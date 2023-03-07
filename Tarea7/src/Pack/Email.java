package Pack;

public class Email {
	private String usuario;
	private String dominio;
	
	public Email(String usuario, String dominio) {
		super();
		this.usuario = usuario;
		this.dominio = dominio;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + getUsuario() + " Correo: " + getDominio();
	}
	
	
}

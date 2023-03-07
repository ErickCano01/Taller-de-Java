package Pack;

public class Nombre {
	private String pNombre;
	private String sNombre;
	private String pApellido;
	private String mApellido;
	private String apodo;
	
	public Nombre(String pNombre, String sNombre, String pApellido, String mApellido, String apodo) {
		super();
		this.pNombre = pNombre;
		this.sNombre = sNombre;
		this.pApellido = pApellido;
		this.mApellido = mApellido;
		this.apodo = apodo;
	}
	public String getpNombre() {
		return pNombre;
	}
	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getpApellido() {
		return pApellido;
	}
	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}
	public String getmApellido() {
		return mApellido;
	}
	public void setmApellido(String mApellido) {
		this.mApellido = mApellido;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	@Override
	public String toString() {
		return getpNombre()+" "+ getsNombre()+" "
				+ getpApellido()+" "+ getmApellido()+" Apodo: "+ getApodo();
	}
	
}

package Pack;

public class Principal {
	public static void main(String[] args) {
		Nombre nombre = new Nombre("Erick","Eduardo","Cano","Osorio","Canito");
		Direccion direccion = new Direccion("Real de Ensenada","14856","12","Real de SanFrancisco","23326","Tijuana","Baja California","Mexico");
		Telefono tel = new Telefono("+52","664","4991823");
		Email email = new Email("Erick Cano","erick.eduardo.cano.osorio@uabc.edu.mx");
		
		Persona p1 = new Persona();
		p1.setNombre(nombre);
		p1.setDireccion(direccion);
		p1.setTel(tel);
		p1.setEmail(email);
		
		System.out.println(p1);
	}
}

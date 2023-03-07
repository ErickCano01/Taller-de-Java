package Pack2;

public class Principal {
	public static void main(String[] args) {
		//Medicos
		Cirujano c1 = new Cirujano(12345,"Erick");
		Cardiologo ca1 = new Cardiologo(1234,"Pepe");
		Dermatologo d1 = new Dermatologo(123,"Emily");
		Endocrinologo e1 = new Endocrinologo(12,"Rebecca");
		Ginecologo g1 = new Ginecologo(1,"Luis");
		
		System.out.println("Medicos");
		System.out.println("\nCirujano\n"+c1);
		System.out.println("\nCardiologo\n"+ca1);
		System.out.println("\nDermatologo\n"+d1);
		System.out.println("\nEndocrinologo\n"+e1);
		System.out.println("\nGinecologo\n"+g1);
		
		//Enfermeros
		SaludMental s1 = new SaludMental(123,"Patrick");
		Geriatrica ge1 = new Geriatrica(12,"Leticia");
		Obstetrico o1 = new Obstetrico(1,"David");
		
		System.out.println("\nEnfermeros");
		System.out.println("\nEnfermero de Salud Mental\n"+s1);
		System.out.println("\nEnfermero de Geriatrica\n"+ge1);
		System.out.println("\nObstetrico\n"+o1);
	}
}

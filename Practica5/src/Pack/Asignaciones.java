package Pack;

public class Asignaciones {
	Alumno a1 = new Alumno();
	Maestro m1 = new Maestro();
	
	public void Alumno() {
		a1.setNombre("Erick Cano");
		a1.setFechaNac("19 mayo 2001");
		a1.setGenero("Masculino");
		a1.setCurp("CAOE");
		a1.setRfc("CAOE123");
		a1.setLugarNac("Tijuana");
		a1.setTelP("664123456");
		a1.setTelE("123456789");
		a1.setDomicilio("Real de SanFrancisco");
		a1.setEstCivil("Soltero");
		a1.setNumIdentificacion(1279386);
		
		a1.setFacultad("Facultad de ciencias quimicas e ingenieria");
		a1.setCarrera("Ingenieria en software y tecnologias emergentes");
		a1.setPorcCreditos(40);
		a1.setEmail("Erick.Eduardo.Cano.Osorio@uabc.edu.mx");
		asignarMaterias();
		a1.setProm(calcularPromedio());
		a1.setSemestre(6);
		System.out.println(a1);
	}
	public void Maestro() {
		m1.setNombre("Maestro Erick Cano");
		m1.setFechaNac("19 mayo 2001");
		m1.setGenero("Masculino");
		m1.setCurp("CAOE");
		m1.setRfc("CAOE123");
		m1.setLugarNac("Tijuana");
		m1.setTelP("664123456");
		m1.setTelE("123456789");
		m1.setDomicilio("Real de SanFrancisco");
		m1.setEstCivil("Soltero");
		m1.setNumIdentificacion(1279385);
		m1.setEmail("Erick.Eduardo.Cano.Osorio@uabc.edu.mx");
		
		m1.setFacultad("Facultad de ciencias quimicas e ingenieria");
		m1.setEspecialidad("Inteligencia Artificial");
		m1.setCategoria("Caro");
		m1.setLicenciatura(true);
		m1.setMaestria(true);
		m1.setDoctorado(false);
		m1.setAntiguedad(5);
		System.out.println(m1);
	}
	public void asignarMaterias() {
		a1.materias.add("Taller de java");
		a1.materias.add("Ingenieria de Requerimientos");
		a1.materias.add("Herramientas de Desarrollo de Software");
		a1.materias.add("Ingenieria de Requerimientos");
		a1.materias.add("Analisis de tecnologias emergentes");
	}
	public float calcularPromedio() {
		float suma=0f;
		for(int i=0;i<a1.materias.size();i++) {
			 suma = suma + a1.getCalf()[i];
		}
		suma = suma/a1.materias.size();
		return suma;
	}
}

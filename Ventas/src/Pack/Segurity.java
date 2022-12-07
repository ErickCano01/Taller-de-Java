package Pack;

import javax.swing.JOptionPane;

public class Segurity {
	
	public void validarUsu(String usu[], String user, String pass, int  intentos) {
		VentanaPrincipal login = new VentanaPrincipal();
		boolean found = false;
		
		for(int i=0; i< usu.length;i++) {
			if((usu[i].equalsIgnoreCase(user)&& usu[i+1].equals(pass))) {
				found = true;
				Menu m = new Menu();
				m.run();
				intentos = 0;
				VentanaPrincipal.setIntentos(intentos);
			}
		}//close for
		if(found==false) {
			JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña son incorrectos van "+intentos+" Intentos fallidos" ,"Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
		}
		if(intentos>2) {
			JOptionPane.showMessageDialog(null,intentos+" Intentos fallidos, El programa se cerrara","Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}
}
